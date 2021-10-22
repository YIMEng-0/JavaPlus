package com.day08;

public class TestHumanBuild {
    public static void main(String[] args) {
        // 创造人对象
        // 创造屋子对象
        // 屋子有自己的主人
        Human human = new Human();
        human.name = "Tom";

        Build build = new Build();
        human.build1 = build;

    }
}
