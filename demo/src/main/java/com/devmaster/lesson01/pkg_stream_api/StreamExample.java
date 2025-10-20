package com.devmaster.lesson01.pkg_stream_api;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    List<Integer> integerList = Arrays.asList(11, 22, 55, 33, 44, 66);

    // 🔹 Cách 1: Không dùng Stream
    public void withoutStream() {
        int count = 0;
        for (Integer integer : integerList) {
            if (integer % 2 == 0) count++;
        }
        System.out.println("Without Stream -> Số phần tử chẵn: " + count);
    }

    // 🔹 Cách 2: Dùng Stream API
    public void withStream() {
        long count = integerList.stream()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("With Stream -> Số phần tử chẵn: " + count);
    }

    // 🔹 Hàm main để chạy thử
    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withoutStream();
        streamExample.withStream();
    }
}
