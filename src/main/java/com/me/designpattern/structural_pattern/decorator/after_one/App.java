package com.me.designpattern.structural_pattern.decorator.after_one;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();
        if (enabledTrimming) {
            commentService = new TrimmingDecorator(commentService);
        }

        if (enabledSpamFilter) {
            commentService = new SpamFilteringDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
