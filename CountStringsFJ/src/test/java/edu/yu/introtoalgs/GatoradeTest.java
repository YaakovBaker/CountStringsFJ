package edu.yu.introtoalgs;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GatoradeTest {

    @Test
    public void testAll(){
        arraySizeTestTenK();
        arraySizeTestTwentyK();
        arraySizeTest40K();
        arraySizeTest80K();
        arraySizeTest160K();
        arraySizeTest320K();
        arraySizeTest640K();
        arraySizeTest1M();
        arraySizeTest2M();
        arraySizeTest5M();
        arraySizeTest10M();
        arraySizeTest20M();
        arraySizeTest40M();
    }

    public void arraySizeTestTenK(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTestTwentyK(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest40K(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }
    
    public void arraySizeTest80K(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest160K(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest320K(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest640K(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest1M(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest2M(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest5M(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest10M(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest20M(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }

    public void arraySizeTest40M(){
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
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", Integer.MAX_VALUE);
        double sequentialTime = 0;
        long startTime = System.nanoTime();
        int count = seq.doIt();
        assertTrue(count>0);
        long endTime = System.nanoTime();
        sequentialTime = (endTime - startTime) / 1_000_000.0;
        System.out.printf("With Array Size %,d and Sequential time %fms\n",words.length,sequentialTime);
    }
}
