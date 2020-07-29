import java.io.*;
import java.util.*;

public class Kata {
  public static int[] sortArray(int[] array) {
    int min=0; 
    for(int i =0;i<array.length;i++) { 
      if(array[i]%2 != 0) {
        for(int j=i;j<array.length;j++) { 
          if(array[j]%2 != 0){ 
            if(array[i]>array[j]) { 
              min=array[j];
              array[j]=array[i]; 
              array[i]=min;
            } 
          } 
        } 
      } 
  }
    return array; 
}
  }
