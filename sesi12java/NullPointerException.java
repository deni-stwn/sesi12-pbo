class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int len = str.length();
            System.out.println("String length: " + len);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }
}
