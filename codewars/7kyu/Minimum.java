// [7 kyu] Form The Minimum
// https://www.codewars.com/kata/5ac6932b2f317b96980000ca

public static int minValue(int[] values){
    SortedSet<Integer> integerSet = new TreeSet<>();

    for(int value : values) {
        integerSet.add(value);
    }

    StringBuilder stringMinValue = new StringBuilder();
    integerSet.stream().forEach(stringMinValue::append);

    return Integer.valueOf(stringMinValue.toString());
}