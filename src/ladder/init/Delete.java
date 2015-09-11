package ladder.init;

import java.io.File;

/**
 * Created by Melvin on 15. 9. 10..
 */
public class Delete {

    public Delete() {}

    public void init() {

        File file = new File("test.txt");



            if (file.delete()) {
                System.out.println("파일이 삭제 되었습니다.");

            } else {
                System.out.println("빈 파일입니다.");
            }


            try {
                file.createNewFile();
            }
            catch(Exception e){
                e.printStackTrace();
            }


        }

    }

