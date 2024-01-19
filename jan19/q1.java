// binary search

public static boolean binarysearch(int arr[] , int k){
  int start = 0 ;
  int k = arr.length -1;
  while(start <=end){
    int mid = (start + end)/2;
    if(arr[mid] == k ) {
      return true;}
    else if(arr[mid]> k ){
      end = mid -1 ; }
    else{
      start = mid +1 ;
    }
  }
  return false;
}
