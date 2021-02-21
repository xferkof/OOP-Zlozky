package org.example;

public class First {
    public static void main(String[] args){
        int i = 8 , j = 8;
        int z = horoskop(i,j);
        switch(z){
            case 1:
                System.out.println("Baran");
                break;
            case 2:
                System.out.println("Byk");
                break;
            case 3:
                System.out.println("Blizenci");
                break;
            case 4:
                System.out.println("Rak");
                break;
            case 5:
                System.out.println("Lev");
                break;
            case 6:
                System.out.println("Panna");
                break;
            case 7:
                System.out.println("Vahy");
                break;
            case 8:
                System.out.println("Skorpion");
                break;
            case 9:
                System.out.println("Strelec");
                break;
            case 10:
                System.out.println("Kozorozec");
                break;
            case 11:
                System.out.println("Vodnar");
                break;
            case 12:
                System.out.println("Ryby");
                break;
            default:
                System.out.println("Chyba");
                break;
        }

    }
    public static int horoskop(int x , int y){
        if(x >= 21 && y==3 || x<=20 && y == 4){
            return 1;
        }
        else if(x >= 21 && y==4 || x<=21 && y == 5){
            return 2;
        }
        else if(x >= 22 && y==5 || x<=21 && y == 6){
            return 3;
        }
        else if(x >= 22 && y==6 || x<=22 && y == 7){
            return 4;
        }
        else if(x >= 23 && y==7 || x<=23 && y == 8){
            return 5;
        }
        else if(x >= 24 && y==8 || x<=23 && y == 9){
            return 6;
        }
        else if(x >= 24 && y==9 || x<=23 && y == 10){
            return 7;
        }
        else if(x >= 24 && y==10 || x<=22 && y == 11){
            return 8;
        }
        else if(x >= 23 && y==11 || x<=21 && y == 12){
            return 9;
        }
        else if(x >= 22 && y==12 || x<=20 && y == 1){
            return 10;
        }
        else if(x >= 21 && y==1 || x<=19 && y == 2){
            return 11;
        }
        else if(x >= 20 && y==2 || x<=20 && y == 3){
            return 12;
        }
        return 0;
    }
}
