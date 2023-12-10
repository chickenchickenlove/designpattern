import abc
from functools import singledispatch
from abc import abstractmethod


class Shape(abc.ABC):
    @abstractmethod
    def print_to(self, device):
        pass


class Circle(Shape):
    def print_to(self, device):
        device.print_hello(self)


class Rectangle(Shape):
    def print_to(self, device):
        device.print_hello(self)


class Device:

    @abstractmethod
    def print_hello(self, x):
        pass


class Phone(Device):

    def print_hello(self, x):
        print_dispatch(x)


# Double Dispatch
@singledispatch
def print_dispatch(x):
    raise NotImplementedError


@print_dispatch.register(Circle)
def _x(x):
    print('Circle Called')


@print_dispatch.register(Rectangle)
def _x(x):
    print('Rectangle Called')


c = Circle()
p = Phone()
r = Rectangle()
c.print_to(p)
r.print_to(p)