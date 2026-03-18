// class Main {
//   public static void main(String[] args) {
//     Sketch main_tester = new Sketch();
//     main_tester.tester();
//   }
// }


public int linearSearch(Item[] a, int catNum){
    for (int i = 0; i < a.length; i++){
        if (a[i].getCatNum() == catNum){
            return a[i].getInventory();
        }
    }
    return -1;
}

public int recursiveLinearSearch(Item[] a, int catNum, int i){
    if (i >= a.length){
        return -1;
    }else if (a[i].getCatNum() == catNum){
        return a[i].getInventory();
    }else{
        return recursiveLinearSearch(a,catNum,i+1);
    }
}

public int binarySearch(Item[] a, int catNum){
    int low = 0;
    int high = a.length-1;
    while(low <= high){
        int guess = (low+high)/2;
        if (a[guess].getCatNum() == catNum){
            return a[guess].getInventory();
        }else if (a[guess] > catNum){
            high = guess - 1;
        }else{
            low = guess + 1;
        }
    }
    return -1;
}

public int recursiveBinarySearch(Item[] a, int catNum, int low, int high){
    int guess = (low + high)/2;
    if (low > high){
        return -1;
    }else if (a[guess].getCatNum() == catNum){
        return a[guess].getInventory();
    }else if (a[guess].getCatNum() > catNum){
        return recursiveBinarySearch(a, catNum, low, guess-1);
    }else{
        return recursiveBinarySearch(a,catNum,guess+1,high);
    }
}
