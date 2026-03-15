class a{
    public static void main(String[] args) {
        int a=44;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a).length());
        System.out.println(Integer.toBinaryString(a).charAt(Integer.toBinaryString(a).length()-1)==0);
    }
}