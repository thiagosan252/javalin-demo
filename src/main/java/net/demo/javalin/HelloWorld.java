package net.demo.javalin;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin.create(/* config */)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}