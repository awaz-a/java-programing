package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));
        // last comma
        System.out.println(technologies.lastIndexOf(","));
        // for middle one, we need ti loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index" + indexOfSql);

        if(technologies.contains("maven")){
            System.out.println("maven is present ");
        } else {
            System.out.println("maven is not present ");
        }


    }}

