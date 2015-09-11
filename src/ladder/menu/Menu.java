package ladder.menu;


import ladder.file.inandout.WriteData;
import ladder.game.Ladder;
import ladder.init.Delete;

import java.util.Scanner;

/**
 * Created by Melvin on 15. 9. 10..
 */
public class Menu {

    Scanner scn = new Scanner(System.in);

    public Menu(){

    }

    public void ShowMenu() {

        System.out.println();
        System.out.println("=== Have a good Lunch ===");
        System.out.println("1. 메뉴 추가");
        System.out.println("2. 게임 시작");
        System.out.println("3. 메뉴 초기화");
        System.out.println("4. 종료");

        ChooseMenu();

    }

    public void ChooseMenu() {

        System.out.print("하나의 메뉴를 선택해 주세요 : ");
            int key = scn.nextInt();

            if( 0 < key && key < 5) {

                switch (key) {
                    case 1:
                        System.out.println("메뉴를 추가해 주세요");
                        new WriteData();
                        ShowMenu();

                    case 2:
                        System.out.println("게임을 시작합니다");
                        new Ladder().process();
                        System.exit(0);

                    case 3:
                        System.out.println("메뉴를 초기화 합니다");
                        new Delete().init();
                        ShowMenu();

                    case 4:
                        System.out.println("프로그램을 종료랍니다");
                        System.exit(0);
                        break;
                } // switch

            } else{
                System.out.println("잘못 입력 하였습니다");
                System.out.println("재 입력해주세요 (1~4)");
                ShowMenu();

        }

    }
}
