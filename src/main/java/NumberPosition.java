public class NumberPosition {

    public Object[][] of(int number) {
        return numberPosition(new Object[getRows(number)][2], Integer.toString(number));
    }

    private Object[][] numberPosition(Object[][] obj, String n) {
        int i = 0;
        for (int j = 0; j < n.length(); j++) {
            if(n.charAt(j) != '0') {
                obj[i][0] = Character.getNumericValue(n.charAt(j));
                obj[i++][1] = n.length()-j-1;
            }
        }
        return obj;
    }

    private int getRows(int number) {
        String figures = Integer.toString(number);
        int counter = 0;
        for(int i = 0; i < figures.length(); i++) {
            if(figures.charAt(i) == '0') counter++;
        }
        return figures.length()-counter;
    }

}