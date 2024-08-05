public class switch_case {
    public static void main(String[] args) {
        String season = "";
        var month = 4;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            case 6:
            case 7:
            case 8:
                season = "Autumn";
                break;
            default:
                season = "Invalid Month";
        }
        System.out.println("Month " + month + " has Season " + season);
    }    
}
