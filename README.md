# Java4
今までに作成したJavaのプログラムを公開しています。

## StoppableController.java / StoppableBall.java /  FallingRainDrop.java / Stoppable.java
StoppableController.javaはキャンバスの左半分をクリックするとボールが、右半分をクリックすると雫の画像が落ちてくるプログラムです。StoppableBall.javaはボールを描画するためのクラス、FallingRainDrop.javaは雫を描画するためのクラスです。インターフェースとしてStoppable.javaを作成しました。

## RecSpiral.java / Spiral.java / Roop.java / BasedRoop.java / RecSpiralInterface.java
次の図のような画像を描画するプログラムです。再帰とインターフェースを使って書いた点でJava3に入っているSpiral.javaとは異なったプログラムとなっています。Roop.javaは正方形を描くクラス、BasedRoop.javaは中身が何も入っていないクラスです。Spiral.javaはRoopを描画するクラスで、ifを使ってRoop.javaを再帰させています。

## TenCircles.java / DrawTenCircles.java
プログラムTenCircles.javaは次のような動きをします。

* 最初にマウスをクリックすると直径が100の赤い円を表示させます。
* マウスをクリックする度に，クリックした位置に従って以下のどちらかを動作をします。
    1. クリックした位置が既にキャンバス上に表示されている円のいずれかに含まれているなら，キャンバス上のすべての円の色を一斉に変更します（赤から緑、或いは緑から赤）。
    2. クリックした位置が既にキャンバス上に表示されている円のどれにも含まれていないなら，画面上の他の円と同じ色で塗り潰され直径が100の円を，クリックした位置に新たに追加します。
* キャンバスに表示される円の個数は10個までとし，それを超える場合には，最も古い円をキャンバスから取り除きます。

DrawTenCircles.javaは円を描画するためのクラスです。
