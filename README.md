# _๐ฅ Movie Kiosk_ (9์กฐ)

---

## ๐ Team Member

| ์ด๋ฆ   | Github                                         |
| ------ | ---------------------------------------------- |
| ์ง์๋ฏธ | [@solmi26](https://github.com/solmi26)         |
| ์ด์์ง | [@Wonjin0138](https://github.com/Wonjin0138)   |
| ๊น๋คํ | [@KIMDAHYUN98](https://github.com/KIMDAHYUN98) |
| ๋ฌธ๊ธฐ์ฉ | [@mkyoung24](https://github.com/mkyoung24)     |
| ๊ฐ๋ณ๊ด | [@G-Lake](https://github.com/G-Lake)           |

---

## ๐ _Environment_

> UI
>
> > Java Swing

> Programming Language
>
> > Java

> DataBase
>
> > Oracle, DBeaver
> >
> > > ์ธ๋ถ ๋ผ์ด๋ธ๋ฌ๋ฆฌ
> > >
> > > > ojdbc8.jar/HikariCP.jar/slf4j-api-1.7.21.jar

---

## ๐ _ER Diagram_

![erd](./MovieKiosk/image/movie/ERD.jpg)

---

## ๐ฟ _Project_

- ๋์์ธ ํจํด

  - MVC ํจํด์ ๊ธฐ๋ฐ์ผ๋กํ ํจํค์ง ๊ตฌ์ฑ

![mvc](https://user-images.githubusercontent.com/84116965/129394319-e93b844f-7ddc-4608-b708-b31ccc3b31bb.png)

- Java Swing์ ์์ ์ถ๋ ฅ

  - Adobe After Effects์ ์ด์ฉํ์ฌ ์์ ์ ์
  - mp4ํ์ผ์ gif๋ก ๋ณํ ํ ํ๋ฉด์ ์ถ๋ ฅ(https://ezgif.com/video-to-gif)

---

<!-- ## ๐ _Issue_

```java
public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame) {
	      LineBorder lineColor = new LineBorder(new Color(87,149,255));

	      setBackground(new Color(255, 255, 255));
	      setLayout(new BorderLayout());
	      setBorder(lineColor);

	      ChkImg img = new ChkImg(img_path,94,87);

	      add(img,"West");

	      JPanel centerPanel = new JPanel();
	      centerPanel.setBackground(Color.white);
	      centerPanel.setLayout(null);

	      JLabel proName = new JLabel(name);
	      proName.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
	      proName.setForeground(Color.black);
	      proName.setBounds(20, 30, 200, 30);

	      JLabel proPrice = new JLabel(price + "์");
	      proPrice.setBounds(220, 30, 78, 31);

	      JLabel proQuan = new JLabel(quantity + "๊ฐ");
	      proQuan.setBounds(342, 35, 32, 16);

	      JButton deleteBtn = new RoundedButton("Delete");
	      deleteBtn.setBounds(410, 30, 50, 50);
	      deleteBtn.setForeground(new Color(255, 0, 0));
	      deleteBtn.setBackground(new Color(255, 30, 255));

	      centerPanel.add(proName);
	      centerPanel.add(proPrice);
	      centerPanel.add(proQuan);
	      centerPanel.add(deleteBtn);

	      add(centerPanel,"Center");

	      deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(proName.getText()));
				frame.setVisible(false);
				new DetailFrame();
			}
		});
	   }
```

> **ScrollPane Issue**
>
> > ์ฅ๋ฐ๊ตฌ๋ ํ๋ชฉ๋ค์ ๊ฐ๊ฐ JPanel๋ก ์ด๋ฃจ์ด์ ธ ์๋ค.<br>
> > ๊ทธ ํจ๋ ์์๋ ํด๋น ํ๋ชฉ์ ์ด๋ฏธ์ง/์ด๋ฆ/๊ฐ๊ฒฉ/์๋์ด ๋ค์ด๊ฐ๋๋ฐ,<br>
> > ์ด ๋ Panel์ Layout์ null๋ก ์ง์ ํด์ฃผ์ด์ผ setBounds ํจ์๋ก ์ํ๋ ์์น์ ์ฝ์ํ  ์ ์๋ค.<br>
> > ํ์ง๋ง JScrollPane Component์ Layout์ Null๋ก ์ง์ ํ๋ฉด ์ ์ฒด ์ฅ๋ฐ๊ตฌ๋์ ์คํฌ๋กค๊ธฐ๋ฅ์ด ๋ค์ด๊ฐ์ง๋ฅผ ์๋๋ค.<br>
> > ์ด ๋ถ๋ถ์ ํด๊ฒฐํ๊ธฐ ์ํด์๋, ๊ฐ๊ฐ์ ํ๋ชฉ Panel์ ์์๋ค์ setBounds๋ก ์ํ๋ ์์น์ ๋ฃ์ ํ์<br>
> > ๊ทธ JPanel์ ๋ค์ JPanel2์ ๋ฃ์ด์ฃผ๊ณ ,JPanel2์ Layout์ Default๊ฐ BorderLayout์ผ๋ก ์ง์ ํ๋ค.<br>
> > ์ฌ๊ธฐ์ ์ฃผ์ํ ์ ์ Scroll ๊ธฐ๋ฅ์ ์ ์ฌ์ด๋์ ๋์ ์ปดํจํฐ๊ฐ ์ธ์งํด์ผ ๋ค์ด๊ฐ๊ธฐ ๋๋ฌธ์<br>
> > JScrollPane์ Component๋ก ๋ค์ด๊ฐ๋ JPanel์์ ์์(JButton,JLabel)์ค ํ๋๋ผ๋ "East","West"์ ์ง์ ์ด ๋์์ด์ผ ํ๋ค.<br>

```java
public class ProductList {
  public static void main(String[] args) {

    if(pbDAO.basketList().size() == 0) {
			JPanel noData = new JPanel();
			noData.setBackground(new Color(255,254,230));
			JLabel msg = new JLabel("์ฅ๋ฐ๊ตฌ๋์ ์ํ์ด ์์ต๋๋ค");
			msg.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			noData.add(msg);
			scroll = new JScrollPane(noData);
			add(scroll);
			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		} else {

			for(int i = 0; i < pbDAO.basketList().size(); ++i) {

				panel2_1.add(new Detail_P2_C(
						pbDAO.basketList().get(i).getImgPath(),
						pbDAO.basketList().get(i).getName(),
						pbDAO.basketList().get(i).getPrice(),
						pbDAO.basketList().get(i).getQuantity(),
						this));

				panel2.add(panel2_1.get(i));

				prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
			}
			scroll = new JScrollPane(panel2);
			add(scroll);

			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		}
  }
}
``` -->

<!-- ## ๐ _Troubles_ -->

## ๐ _Issue_

<details>
	<summary>ScrollPane</summary>

```java
public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame) {
	      LineBorder lineColor = new LineBorder(new Color(87,149,255));

	      setBackground(new Color(255, 255, 255));
	      setLayout(new BorderLayout());
	      setBorder(lineColor);

	      ChkImg img = new ChkImg(img_path,94,87);

	      add(img,"West");

	      JPanel centerPanel = new JPanel();
	      centerPanel.setBackground(Color.white);
	      centerPanel.setLayout(null);

	      JLabel proName = new JLabel(name);
	      proName.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
	      proName.setForeground(Color.black);
	      proName.setBounds(20, 30, 200, 30);

	      JLabel proPrice = new JLabel(price + "์");
	      proPrice.setBounds(220, 30, 78, 31);

	      JLabel proQuan = new JLabel(quantity + "๊ฐ");
	      proQuan.setBounds(342, 35, 32, 16);

	      JButton deleteBtn = new RoundedButton("Delete");
	      deleteBtn.setBounds(410, 30, 50, 50);
	      deleteBtn.setForeground(new Color(255, 0, 0));
	      deleteBtn.setBackground(new Color(255, 30, 255));

	      centerPanel.add(proName);
	      centerPanel.add(proPrice);
	      centerPanel.add(proQuan);
	      centerPanel.add(deleteBtn);

	      add(centerPanel,"Center");

	      deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(proName.getText()));
				frame.setVisible(false);
				new DetailFrame();
			}
		});
	   }
```

<!-- > **ScrollPane Issue** -->

> Problem
>
> > ์ฅ๋ฐ๊ตฌ๋ ํ๋ชฉ๋ค์ ๊ฐ๊ฐ JPanel๋ก ์ด๋ฃจ์ด์ ธ ์๋ค.<br>๊ทธ ํจ๋ ์์๋ ํด๋น ํ๋ชฉ์ ์ด๋ฏธ์ง/์ด๋ฆ/๊ฐ๊ฒฉ/์๋์ด ๋ค์ด๊ฐ๋๋ฐ,<br>์ด ๋ Panel์ Layout์ null๋ก ์ง์ ํด์ฃผ์ด์ผ setBounds ํจ์๋ก ์ํ๋ ์์น์ ์ฝ์ํ  ์ ์๋ค.<br> ํ์ง๋ง JScrollPane Component์ Layout์ Null๋ก ์ง์ ํ๋ฉด ์ ์ฒด ์ฅ๋ฐ๊ตฌ๋์ ์คํฌ๋กค๊ธฐ๋ฅ์ด ๋ค์ด๊ฐ์ง๋ฅผ ์๋๋ค.<br>
> >
> > > Solution
> > >
> > > > ์ด ๋ถ๋ถ์ ํด๊ฒฐํ๊ธฐ ์ํด์๋, ๊ฐ๊ฐ์ ํ๋ชฉ Panel์ ์์๋ค์ setBounds๋ก ์ํ๋ ์์น์ ๋ฃ์ ํ์<br>๊ทธ JPanel์ ๋ค์ JPanel2์ ๋ฃ์ด์ฃผ๊ณ ,JPanel2์ Layout์ Default๊ฐ BorderLayout์ผ๋ก ์ง์ ํ๋ค.<br> ์ฌ๊ธฐ์ ์ฃผ์ํ ์ ์ Scroll ๊ธฐ๋ฅ์ ์ ์ฌ์ด๋์ ๋์ ์ปดํจํฐ๊ฐ ์ธ์งํด์ผ ๋ค์ด๊ฐ๊ธฐ ๋๋ฌธ์<br>JScrollPane์ Component๋ก ๋ค์ด๊ฐ๋ JPanel์์ ์์(JButton,JLabel)์ค ํ๋๋ผ๋ "East","West"์ ์ง์ ์ด ๋์์ด์ผ ํ๋ค.<br>

```java
public class ProductList {
  public static void main(String[] args) {

    if(pbDAO.basketList().size() == 0) {
			JPanel noData = new JPanel();
			noData.setBackground(new Color(255,254,230));
			JLabel msg = new JLabel("์ฅ๋ฐ๊ตฌ๋์ ์ํ์ด ์์ต๋๋ค");
			msg.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			noData.add(msg);
			scroll = new JScrollPane(noData);
			add(scroll);
			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		} else {

			for(int i = 0; i < pbDAO.basketList().size(); ++i) {

				panel2_1.add(new Detail_P2_C(
						pbDAO.basketList().get(i).getImgPath(),
						pbDAO.basketList().get(i).getName(),
						pbDAO.basketList().get(i).getPrice(),
						pbDAO.basketList().get(i).getQuantity(),
						this));

				panel2.add(panel2_1.get(i));

				prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
			}
			scroll = new JScrollPane(panel2);
			add(scroll);

			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		}
  }
}
```

</details>

<details>
	<summary>Cancel Seats & Rollback Button</summary>      
	
> Problem
> > ์ข์์ ๊ณ ๋ฅด๋ ๊ณผ์ ์์ ์ข์์ ์ ํํ ํ ๋ง์์ด ๋ฐ๋์ด์ ๊ณจ๋๋ ๊ฒ์ ์ทจ์ํ๊ธฐ ์ํด <br>ํ ๋ฒ ๋ ํด๋ฆญํ๋ฉด ์๋์ ์์ผ๋ก ๋์์์ผ ํ์ผ๋ ๋ฒํผ์ ์๊น์ ๋ฐ์์ค๋ ๋ฉ์๋๋ฅผ ์ฐพ์ง ๋ชปํจ.
> > > Solution 
> > > >๊ฐ ๋ฒํผ์ด ํ์ฌ ์ ํ์ด ๋์๋์ง ์๋์๋์ง ๋ด์๋ ๋ฐฐ์ด์ ์ ์ญ๋ณ์๋ก ๋ง๋ค์ด ๋์ด ์ํ๋ฅผ ํ์ธํ  ์ ์๋ค๋ฉด ๋  ๊ฒ ๊ฐ๋ค๋ ์์ด๋์ด ๋ฐ์.<br> ํด๋์ค์ boolean ํ์์ ๋ฐฐ์ด์ ๋ง๋ ๋ค false์ํ์์ ํด๋ฆญ์ ํ์ ๊ฒฝ์ฐ ํด๋น index์ ๊ฐ์ true๋ก ๋ฐ๊ฟ์ฃผ๊ณ  ์๊น์ ๋ฐ๊ฟ์ฃผ์์ผ๋ฉฐ<br> true์์ ๋ค์ ํด๋ฆญ์ ํ์ ๊ฒฝ์ฐ false๋ก ๋ฐ๊พผ ๋ค ์๋์ ์๊น๋ก ๋์ค๊ฒ ์์ ํ๋ค.

```java
	if(SeatChoice_1.th1e_btn_selected[index - 1])
         {
            SeatChoice_1.th1e_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0x404040));
            SeatChoice_1.selected_cnt--;
            SeatChoice_1.ticket_price -= SeatChoice_1.th1e_btn_price[index - 1];
            SeatChoice_1.price_label.setText("์ผ๋ฐ: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "์ฅ์ ์ธ: " + PeopleCheck.disable_cnt + "              " + "๊ฐ๊ฒฉ: " + SeatChoice_1.ticket_price);

         }
         else
         {
            if(SeatChoice_1.peoples > SeatChoice_1.selected_cnt)
            {
               SeatChoice_1.th1e_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_1.selected_cnt++;
               SeatChoice_1.ticket_price += SeatChoice_1.th1e_btn_price[index - 1];
               SeatChoice_1.price_label.setText("์ผ๋ฐ: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "์ฅ์ ์ธ: " + PeopleCheck.disable_cnt + "              " + "๊ฐ๊ฒฉ: " + SeatChoice_1.ticket_price);
            }

```

</details>

<details>
	<summary>Duplicate selection error</summary>
	
> Problem
> > ์ธ์์๋ฅผ ๊ณ ๋ฅด๋ ๊ณผ์ ์์ ์ธ์์๋ฅผ ํด๋ฆญํ ๋ค ๋ง์์ด ๋ฐ๋์ด ๋ค๋ฅธ ์ํ๋ฅผ ์ ํํ์ ๋ <br>์ธ์์๋ฅผ ๊ณ ๋ฅด๋ ํ๋ ์์ ๊ธฐ์กด์ ํด๋ฆญ๋ผ์๋ ๋ฒํผ์ด ๊ทธ๋๋ก ํด๋ฆญ๋์ด์๋ ๋ฌธ์ ๊ฐ ๋ฐ์ํจ.
> > > Solution 
> > > > ์ธ์์๋ฅผ ๊ณ ๋ฅด๋ ํ๋ ์์ด ๋ด์๋ ๋ง๋ค ๋ฒํผ๋ค์ ์ด๊ธฐํํด์ค๋ค๋ฉด ํด๊ฒฐ์ด ๋  ๊ฒ ๊ฐ๋ค๋ ์์ด๋์ด ๋ฐ์.<br>์ธ์์๋ฅผ ๊ณ ๋ฅด๋ค๊ฐ ๋๋ ์ข์์ ๊ณ ๋ฅด๋ค๊ฐ ๋ค๋ฅธ ์ํ๋ฅผ ๋ณด๊ณ  ์ถ์ด์ง ๊ฒฝ์ฐ ์ด์ ์ผ๋ก ๋์๊ฐ๋ ํญ์ 0๋ช์ ๋ฒํผ์ด ์ฒดํฌ๋ผ์๋๋ก ์์ ํจ.

```java
for(int i = 1; i < btns1.size(); i++) {
				adult_btn.get(i).setBackground(new Color(0x404040));
				child_btn.get(i).setBackground(new Color(0x404040));
				disable_btn.get(i).setBackground(new Color(0x404040));
				old_btn.get(i).setBackground(new Color(0x404040));
			}
			adult_cnt = 0;
			child_cnt = 0;
			disable_cnt = 0;
			old_cnt = 0;
			pre_adult_btn_num = 0;
			now_adult_btn_num = 0;
			pre_child_btn_num = 0;
			now_child_btn_num = 0;
			pre_disable_btn_num = 0;
			now_disable_btn_num = 0;
			pre_old_btn_num = 0;
			now_old_btn_num = 0;

		adult_btn.get(0).setBackground(new Color(0xCC0066));
		child_btn.get(0).setBackground(new Color(0xCC0066));
		disable_btn.get(0).setBackground(new Color(0xCC0066));
		old_btn.get(0).setBackground(new Color(0xCC0066));

```

</details>
	
<details>
	<summary>Check Type Verification</summary>   
	
> Problem
> > ์ข์ ์ ํ์ค ์ฅ์ ์ธ์์ ์ซ์๋ ํ์ ์ ์ธ๋ฐ ์ฅ์ ์ธ์ด ์๋ ์ฌ๋์ด ์ฅ์ ์ธ์์ ์์ฝํ๋ ๊ฒฝ์ฐ ์ค๋ฅ ๋ฉ์์ง๋ฅผ ๋์์ผ ๋๋ค๊ณ  ์๊ฐํ์ผ๋<br> ์ฌ๋ ์ธ์ ์ค์์ ์ฅ์ ์ธ์ ์ซ์๋ฅผ ์ ์๊ฐ ์์์.
> > > Solution 
> > > > ์ธ์์๋ฅผ ์ ์ฒด์ธ์์ด ์๋ ์ฅ์ ์ธ ์ธ์์ ๋ณ์์ ๋ฐ๋ก ์ ์ฅํด๋์ด ์ธ์ ์๋ฅผ ํ์ธํ๋ฉด ๋  ๊ฒ ๊ฐ๋ค๋ ์์ด๋์ด ๋ฐ์.<br>์ฅ์ ์ธ ์ธ์์๋ณด๋ค ๋ง์ ์๋ฅผ ์์ฝํ๋ ค๊ณ  ํ๋ฉด ์๋ฌ ๋ฉ์์ง๋ฅผ ๋์ค๊ฒ ์ค์ ํด๋์ด์ ์ฅ์ ์ธ์์ ์ฅ์ ์ธ๋ง ์์ฝํ  ์ ์๊ฒ ์์ .

```java
if(PeopleCheck.disable_cnt == 0)
                  {
                     ErrorFrame frame = new ErrorFrame();
                     frame.getContentPane().setBackground(new Color(0x404040));
                     frame.setDefaultOptions();
                     JLabel label = new JLabel();
                     label.setText("์ฅ์ ์ธ๋ง ์์ฝ ๊ฐ๋ฅํฉ๋๋ค.");
                     label.setFont(new Font("๋์", Font.PLAIN|Font.BOLD, 30));
                     label.setForeground(Color.white);
                     label.setHorizontalAlignment(JLabel.CENTER);
                     frame.add(label);
                  }
                  else
                  {
                     if(PeopleCheck.disable_cnt > SeatChoice_1.disable_btn_cnt)
                     {
                        SeatChoice_1.th1a_btn_selected[index - 1] = true;
                        btn.setBackground(new Color(0xFF3333));
                        SeatChoice_1.disable_btn_cnt++;
                        SeatChoice_1.selected_cnt++;
                        SeatChoice_1.ticket_price += SeatChoice_1.th1a_btn_price[index - 1];
                        SeatChoice_1.price_label.setText("์ผ๋ฐ: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "์ฅ์ ์ธ: " + PeopleCheck.disable_cnt + "              " + "๊ฐ๊ฒฉ: " + SeatChoice_1.ticket_price);
                     }
                     else
                     {
                        ErrorFrame frame = new ErrorFrame();
                        frame.getContentPane().setBackground(new Color(0x404040));
                        frame.setDefaultOptions();
                        JLabel label = new JLabel();
                        label.setText("์ฅ์ ์ธ๋ง ์์ฝ ๊ฐ๋ฅํฉ๋๋ค.");
                        label.setFont(new Font("๋์", Font.PLAIN|Font.BOLD, 30));
                        label.setForeground(Color.white);
                        label.setHorizontalAlignment(JLabel.CENTER);
                        frame.add(label);
                     }

```

</details>

</details>
	
<details>
	<summary>Get movie information</summary>

> Problem
>
> > ์ํ ์๊ฐ์ ์ ํํ๋ฉด ๊ทธ์ ๋ฐ๋ฅธ ์ํ ์ ๋ณด์ ๋ค๋ฅธ ์ ๋ณด๋ค์ด ๊ฐ์ด ์์ผ ํ๋ ์ํฉ์ด ์์๋๋ฐ<br>
> > ๋ฒํผ์์ ๊ฐ์ ธ์ฌ ์ ์๋๊ฒ์ ์ํ๊ฐ ์์ํ๋ ์๊ฐ ํ๋๋ผ์ ์ด๊ฒ์ผ๋ก ๋ค๋ฅธ ์ ๋ณด๋ค์ ์ฐ๊ฒฐํด์ ์ฐพ๊ธฐ๊ฐ ์ด๋ ค์ ์<br>
> > ๋ง์ฝ ๊ฐ์ ์๊ฐ๋์ ์์ํ๋ ๋ค๋ฅธ ์ํ๋ค์ด ์กด์ฌํ๋ฉด ์ด๋ค ์ํ์ ์๊ฐ์ธ์ง ์ ์ ์๊ธฐ์ ์ํ๋ ์ ๋ณด๋ฅผ ์ป์ ์ ์์์<br>
> >
> > > Solution
> > >
> > > > ๋ฒํผ์ ๋ง๋ค ๋ ์ํ๋ง๋ค ์ํ ์ ๋ณด๊ฐ ๋ด๊ฒจ์๋ ํด๋์ค๋ฅผ ๋ฐ๋ก ๋ง๋ค์ด์ <br>
> > > > ๋ฒํผ์ ๋ฆฌ์ค๋ ๊ธฐ๋ฅ์ ์ถ๊ฐํ  ๋ ๊ทธ์ ๋ง๋ ์ํ ํด๋์ค ์ ๋ณด๋ฅผ ๋ด์ ๋๋ ๋ฐฉ๋ฒ์ ์ ํํจ.<br>
> > > > 1๋ฒ ์ํ๋ฅผ ์ ํํ๋ฉด ๋ฒํผ์ด ๊ตฌํ๋์ด ์๋ ํด๋์ค ์์ฒด์ 1๋ฒ ์ํ์ ์ ๋ณด๋ฅผ ๋ด์ ๋๊ณ 
> > > > ์๊ฐ ์ ๋ณด๋ ๋ฒํผ์ ์ด๋ฆ์ ์ค์ ํด๋์ ๋ค์<br>
> > > > ๋ฒํผ์ ํด๋ฆญํ๋ฉด 1๋ฒ ์ํ๊ฐ ๋ด๊ฒจ์ ธ ์๋ ํด๋์ค๋ก ๋์ด๊ฐ๊ณ <br>
> > > > ํด๋์ค์๋ ์ด๋ฏธ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ๊ฐ์ ธ์จ ์๊ฐ ์ ๋ณด์ ์ํ ์ ๋ณด๋ค์ด ๋ด๊ฒจ ์๊ธฐ์<br>
> > > > ์๊ฐ๋๋ฅผ ๋น๊ตํด์ ํด๋น ์ํ๊ฐ ๊ฐ์ง๊ณ  ์๋ ๋ค๋ฅธ ์ ๋ณด๋ค์ ๊ฐ์ ธ์ค๋ ๋ฐฉ์์ ์ฌ์ฉํจ.<br>

```java


```

</details>

---

## ๐ธ _ScreenShot_

<details>
<summary>๋ก๋ฉ ํ๋ฉด</summary>
<div markdown="1">

![main](./MovieKiosk/image/md/%EB%A1%9C%EB%94%A9%EC%B0%BD.jpg)

</div>
</details>

<details>
<summary>๋ฉ์ธ ํ๋ฉด</summary>
<div markdown="1">

![main](./MovieKiosk/image/md/%EB%A9%94%EC%9D%B8%ED%99%94%EB%A9%B4.jpg)

</div>
</details>

<details>
<summary>๊ฐ์ฅ ๋นจ๋ฆฌ ๋ณผ ์ ์๋ ์ํ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 012](./MovieKiosk/image/md/%EB%B9%A0%EB%A5%B8%EC%98%88%EB%A7%A4.jpg)

</div>
</details>     
	
<details>
<summary>์ ์ฒด ์์ ์๊ฐํ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 011](./MovieKiosk/image/md/%EC%A0%84%EC%B2%B4.jpg)

</div>
</details>    
	
<details>
<summary>์ํ ์ธ์ ์ ํ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 004](./MovieKiosk/image/md/%EC%98%88%EB%A7%A4%EC%B0%BD.jpg)

</div>
</details>     
	
	
<details>
<summary>์ํ ์ข์ ์ ํ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 004](./MovieKiosk/image/md/%EC%98%88%EB%A7%A4%EC%B0%BD2.jpg/)

</div>
</details>     
	
	
<details>
<summary>์ํ ํฐ์ผ ์ถ๋ ฅ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 002](./MovieKiosk/image/md/%EC%98%88%EB%A7%A4%EC%99%84%EB%A3%8C.jpg)

</div>
</details>

<details>
<summary>์๋งค ๋ฒํธ๋ก ํ์ฅ ๋ฐ๊ถ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 002](./MovieKiosk/image/md/%ED%98%84%EC%9E%A5%EB%B0%9C%EA%B6%8C.jpg)
![KakaoTalk_Photo_2021-08-24-12-40-06 002](./MovieKiosk/image/md/%EC%B6%9C%EB%A0%A5.jpg)

</div>
</details>    
	
	
<details>
<summary>๋งค์  ๋ฉ์ธ ํ๋ฉด</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 007](https://user-images.githubusercontent.com/77534863/130552585-173b7a7c-d9fa-468f-86d0-9fc50fd2880e.jpeg)

</div>
</details>      
	
<details>
<summary>์์ ์ํ ์ ํ</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 010](./MovieKiosk/image/md/%EB%A7%A4%EC%A0%90.jpg)

</div>
</details>     
	
	
<details>
<summary>์์ ์ฅ๋ฐ๊ตฌ๋ ํ๋ฉด</summary>
<div markdown="1">

![KakaoTalk_Photo_2021-08-24-12-40-06 008](./MovieKiosk/image/md/%EC%9E%A5%EB%B0%94%EA%B5%AC%EB%8B%88.jpg)

</div>
</details>

## ๐ธ _Demonstration Video_

<details>
<summary>GUI ํ๋ฉด ์์</summary>
<div markdown="1">

https://www.youtube.com/watch?v=glsCLeQRryQ

</div>
</details>

## ๐ _Reference_

- https://github.com/TeamProjectGroupNo1/movieKiosk
- https://github.com/seohyun319/Elderly_People_Kiosk_Project
- https://github.com/WoojaeJang/CafeKioskSystem-JavaWebProject
- https://woongbin96.tistory.com/m/70
