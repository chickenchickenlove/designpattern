package com.me.designpattern.behavioral_pattern.iterator.after;

import java.util.Iterator;

public class Client {

    private final Iterator<Post> iterator;

    public Client(Iterator<Post> iterator) {
        this.iterator = iterator;
    }

    public void printPost() {
        while(this.iterator.hasNext()){
            System.out.println(this.iterator.next().getTitle());
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        Iterator<Post> naturalOrderIterator = board.getNaturalOrderIterator();
        Client client = new Client(naturalOrderIterator);
        client.printPost();

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        Client client1 = new Client(recentPostIterator);
        client1.printPost();

    }
}