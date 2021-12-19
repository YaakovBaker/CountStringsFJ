package edu.yu.introtoalgs;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/** Implements the CountStringsFJ semantics specified in the requirements
 * document.
 *
 * @author Avraham Leff
 */

public class CountStringsFJ {

  /**
   * Disclaimer: Sorry for the wierd names, but its called "Fork"Join so I had fun with the names
   */
  private class SporkJoin extends RecursiveTask<Integer>{
    private int low;
    private int high;
    SporkJoin(int low, int high){
      this.low = low;
      this.high = high;
    }

    @Override
    protected Integer compute() {
      if( (high - low) <= threshold ){
        return sequential(low, high);
      }
      int cutoff = (high+low)/2;
      SporkJoin napkin = new SporkJoin(low, cutoff);//left
      SporkJoin cup = new SporkJoin(cutoff, high);//right
      napkin.fork();
      Integer cupSum = cup.compute(); //right
      Integer napkinSum = napkin.join();//left
      return cupSum + napkinSum;
    }
  }


  private final String[] arr;
  private final String str;
  private final int threshold;
  private final int strArrLength;
  //12 processors on desktop

  /** Constructor.
   *
   * @param arr the array to process, can't be null or empty
   * @param str the string to match, can't be null, may be empty
   * @param threshold when the length of arr is less than threshold, processing
   * must be sequential; otherwise, processing must use a fork/join, recursive
   * divide-and-conquer strategy.  The parameter must be greater than 0.
   *
   * IMPORTANT: Students must use this constructor, they MAY NOT add another
   * constructor.
   */
  public CountStringsFJ(final String[] arr, final String str, final int threshold) {
    if( arr == null || arr.length == 0 ){
      throw new IllegalArgumentException("Array cannot be null or empty");
    }
    if( str == null || str.isEmpty() ){
      throw new IllegalArgumentException("String cannot be null or empty");
    }
    if( threshold <= 0 ){
      throw new IllegalArgumentException("Threshold must be greater than 0");
    }
      this.arr = arr;
      this.str = str;
      this.threshold = threshold;
      this.strArrLength = arr.length;
  }
  
  /** Returns the number of elements in arr that ".equal" the "str" parameter
   *
   * @return Using a strategy dictated by the relative values of threshold and
   * the size of arr, returns the number of times that str appears in arr
   */
  public int doIt() {
      if( strArrLength <= threshold ){
        return sequential(0, strArrLength);
      }
      SporkJoin knife = new SporkJoin(0, strArrLength);
      ForkJoinPool dinner = new ForkJoinPool();
      int dinnerSum = dinner.invoke(knife);
      dinner.shutdown();
      return dinnerSum;
  }

  private int sequential(int start, int length){
    int count = 0;
    for(int i = start; i < length; i++){
      if(arr[i].equals(str)){
        count++;
      }
    }
    return count;
  }
}
