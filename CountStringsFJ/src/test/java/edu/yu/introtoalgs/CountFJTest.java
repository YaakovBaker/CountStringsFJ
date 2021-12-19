package edu.yu.introtoalgs;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CountFJTest {
    
    @Test
    public void testOne(){
        final String [] arr = {"h", "ee", "llll", "llll", "oo", "llll"};
        final String str1 = "llll";
        final int threshold1 = 3;
        final CountStringsFJ countStringsFJ1 = new CountStringsFJ( arr , str1 , threshold1 );
        final int retval1 = countStringsFJ1.doIt();
        System.out.printf("retval1 = %d\n", retval1 );
        assertEquals(3, retval1);

        final String str2 = "h";
        final int threshold2 = 3;
        final CountStringsFJ countStringsFJ2 = new CountStringsFJ( arr , str2 , threshold2 );
        final int retval2 = countStringsFJ2.doIt();
        System.out.printf("retval2 = %d\n", retval2 );
        assertEquals(1, retval2);
    }

    @Test
    public void testTwo(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:/Users/yyb20/OneDrive/Documents/Algorithms/BiblePass/BibleParse.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
        }
        String[] words = lines.toArray(new String[0]);
        CountStringsFJ seq = new CountStringsFJ(words, "Genesis", 1000000);
        int count = seq.doIt();
        System.out.printf("count = %d\n", count);
        assertEquals(6, count);
    }
}
