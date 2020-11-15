class StrExcep {
    public static void main(String[] args) {
        String language[] = {"C++", "Java", "Perl", "Python"};

        try {
            for (int c=1; c<=5; c++) {
                System.out.println(language[c]);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Block finally always executes.");
        }
    }
}