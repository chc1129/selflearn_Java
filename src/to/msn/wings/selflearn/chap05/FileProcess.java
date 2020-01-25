package to.msn.wings.selflearn.chap05;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public class FileProcess {

    public static void main(String[] args) {
        try {
            var fs = FileSystems.getDefault();
            var path1 = fs.getPath("C:/data/sample.txt");

            // ファイルが存歳するか
            System.out.println(Files.exists(path1));        // 結果:true
            // ファイルが読み取り可能か
            System.out.println(Files.isReadable(path1));    // 結果:true
            // ファイルが書き込み可能か
            System.out.println(Files.isWritable(path1));    // 結果:true
            // ファイルが実行可能か
            System.out.println(Files.isExecutable(path1));  // 結果:true
            // ファイルのサイズを取得
            System.out.println(Files.size(path1));
            // ファイルをコピー（存在する場合は置換）
            var path2 = Files.copy(path1, fs.getPath("C:/data/copy.txt"),
                    StandardCopyOption.REPLACE_EXISTING);
            // ファイルを移動（存在する場合は置換）
            Files.move(path2, fs.getPath("C:/data/sub/copy.txt"),
                    StandardCopyOption.REPLACE_EXISTING);
            // ファイル名を変更(存在する場合は置換)
            var path3 = Files.move(path1, fs.getPath("C:/data/sub/rename.txt"),
                    StandardCopyOption.REPLACE_EXISTING);
            // ファイルを削除
            Files.delete(path3);
            // ファイルが存在する場合にだけ削除
            Files.deleteIfExists(path3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
