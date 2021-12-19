package edu.yu.introtoalgs;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreadTests {

    @Test
    public void parallelPerformanceSize10k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse10k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            for(int thresh = 500; thresh < wordsLength; thresh+=500){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Threshold: %d\tTime: %.2f\tCount: %d\n", thresh, elapsedParallelTime, count);
            }
            System.out.println("DONEL");
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize20k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse20k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            for(int thresh = 500; thresh < wordsLength; thresh+=500){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Threshold: %d\tTime: %.2f\tCount: %d\n", thresh, elapsedParallelTime, count);
            }
            System.out.println("DONEL");
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize40k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse40k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            for(int thresh = 2000; thresh < wordsLength; thresh+=2000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Threshold: %d  Time: %.2f  Count: %d\n", thresh, elapsedParallelTime, count);
            }
            System.out.println("DONEL");
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize80k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse80k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 1;
            for(int thresh = 2000; thresh < wordsLength; thresh+=4000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.println("DONEL");
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize160k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse160k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 1;
            for(int thresh = 2000; thresh < wordsLength; thresh+=8000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.println("DONEL");
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize320k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse320k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 1;
            for(int thresh = 2000; thresh < wordsLength; thresh+=16000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", innerLoop - 1);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize640k(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse640k.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 1;
            for(int thresh = 2000; thresh < wordsLength; thresh+=32000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", innerLoop - 1);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize1M(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse1M.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 1;
            for(int thresh = 2000; thresh < wordsLength; thresh+=64000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", i);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize2M(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse2M.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 0;
            for(int thresh = 4000; thresh < wordsLength; thresh+=128000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", i);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize5M(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse5M.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 0;
            for(int thresh = 4000; thresh < wordsLength; thresh+=256000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", i);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize10M(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse10M.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 0;
            for(int thresh = 50_000; thresh < wordsLength; thresh+=500_000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", i);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize20M(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse20M.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 0;
            for(int thresh = 50_000; thresh < wordsLength; thresh+=1_000_000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", i);
        }
        System.out.println("DONE");
    }

    @Test
    public void parallelPerformanceSize40M(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse40M.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        Collections.shuffle(lines);
        String[] words = lines.toArray(new String[0]);
        int wordsLength = words.length;
        System.out.printf("Array Size: %d\n", wordsLength);
        for(int i = 4; i >= 0; i--){
            int innerLoop = 0;
            for(int thresh = 50_000; thresh < wordsLength; thresh+=2_000_000){
                CountStringsFJ thread = new CountStringsFJ(words, "Genesis", thresh);
                long startTime = System.nanoTime();
                int count = thread.doIt();
                long endTime = System.nanoTime();
                double elapsedParallelTime = (endTime - startTime) / 1_000_000.0;
                System.out.printf("Loop: %d  Threshold: %d  Time: %.2f\n", innerLoop, thresh, elapsedParallelTime);
                innerLoop++;
            }
            System.out.printf("DONE: %d\n", i);
        }
        System.out.println("DONE");
    }
}
