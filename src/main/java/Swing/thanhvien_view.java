package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

import dl.thanhvien;

public class thanhvien_view extends JFrame {

	private JTable table;
	private JScrollPane scroll_tiable;
	private JPanel south, btn, txt, search;
	private JButton them, sua, xoa, huy, ghi, timkiem;
	private JTextField id, ma, ten, email, date, dc, txt_tk;

	public thanhvien_view() {
		btn = new JPanel(new FlowLayout());

		them = new JButton("Them");
		sua = new JButton("sua");
		xoa = new JButton("xoa");
		huy = new JButton("huy");
		ghi = new JButton("ghi");

		btn.add(them);
		btn.add(sua);
		btn.add(xoa);
		btn.add(huy);
		btn.add(ghi);

		txt = new JPanel(new GridLayout(6, 2));

		id = new JTextField();
		ma = new JTextField();
		ten = new JTextField();
		email = new JTextField();
		date = new JTextField();
		dc = new JTextField();

		txt.add(new JLabel("Id"));
		txt.add(id);

		txt.add(new JLabel("ma"));
		txt.add(ma);
		txt.add(new JLabel("ten"));
		txt.add(ten);
		txt.add(new JLabel("email"));
		txt.add(email);
		txt.add(new JLabel("date"));
		txt.add(date);
		txt.add(new JLabel("dia chi"));
		txt.add(dc);

		search = new JPanel(new GridLayout(2, 3));
		timkiem = new JButton("tim kiem");
		txt_tk = new JTextField();

		search.add(new JLabel("ten"));
		search.add(txt_tk);
		search.add(timkiem);
		search.add(new JLabel(""));
		search.add(new JLabel(""));
		search.add(new JLabel(""));
		south = new JPanel(new BorderLayout());
		south.add(search, BorderLayout.NORTH);
		south.add(txt, BorderLayout.CENTER);
		south.add(btn, BorderLayout.SOUTH);

		table = new JTable();
		scroll_tiable = new JScrollPane(table);

		this.setLayout(new BorderLayout());
		this.add(scroll_tiable, BorderLayout.CENTER);
		this.add(south, BorderLayout.SOUTH);
		this.setTitle("Quan ly thanh vien");
		this.setSize(600, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void showTT(thanhvien tv) {

		id.setText("" + tv.getId());
		ma.setText("" + tv.getMa());
		ten.setText("" + tv.getTen());
		email.setText("" + tv.getEmail());
		date.setText("" + tv.getDate());
		dc.setText("" + tv.getDc());

		them.setEnabled(false);
		sua.setEnabled(true);
		xoa.setEnabled(true);
		huy.setEnabled(true);

	}

	public void clearTT() {
		id.setText("");
		ma.setText("");
		ten.setText("");
		email.setText("");
		date.setText("");
		dc.setText("");

		them.setEnabled(true);
		sua.setEnabled(false);
		xoa.setEnabled(false);
		huy.setEnabled(false);

	}

	public void showTB(String tv) {
		JOptionPane.showMessageDialog(this, tv);
	}

	public void showlistTT(thanhvien_model_table model) {
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);

		table.getColumnModel().getColumn(0).setHeaderValue("ID");
		table.getColumnModel().getColumn(1).setHeaderValue("Ma");
		table.getColumnModel().getColumn(2).setHeaderValue("Ten");
		table.getColumnModel().getColumn(3).setHeaderValue("Email");
		table.getColumnModel().getColumn(4).setHeaderValue("ngay TG");
		table.getColumnModel().getColumn(5).setHeaderValue("dia chi");

	}

	public void fill() {
		int row = table.getSelectedRow();
		if (row >= 0) {
			id.setText(table.getModel().getValueAt(row, 0).toString());
			ma.setText(table.getModel().getValueAt(row, 1).toString());
			ten.setText(table.getModel().getValueAt(row, 2).toString());
			email.setText(table.getModel().getValueAt(row, 3).toString());
			date.setText(table.getModel().getValueAt(row, 4).toString());
			dc.setText(table.getModel().getValueAt(row, 5).toString());
		}
		them.setEnabled(false);
		sua.setEnabled(true);
		xoa.setEnabled(true);
		huy.setEnabled(true);

	}

	public thanhvien infor() {
		thanhvien tv = new thanhvien();
		try {
			if (id.getText() != "" && !"".equals(id.getText())) {

				tv.setId(Integer.parseInt(id.getText()));
			}
			tv.setMa(ma.getText());
			tv.setTen(ten.getText());
			tv.setEmail(email.getText());
			tv.setDate(date.getText());
			tv.setDc(dc.getText());

			return tv;

		} catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}
	
	
	// tim theo ten
	public String trave() {
		return txt_tk.getText();
	}
	
	public void them_view(ActionListener ac) {
		them.addActionListener(ac);
	}
	
	public void sua_view(ActionListener ac) {
		sua.addActionListener(ac);
	}
	public void xoa_view(ActionListener ac) {
		xoa.addActionListener(ac);
	}
	public void huy_view(ActionListener ac) {
		huy.addActionListener(ac);
	}
	public void ghi_view(ActionListener ac) {
		ghi.addActionListener(ac);
	}
	public void timkiem_view(ActionListener ac) {
		timkiem.addActionListener(ac);
	}
	
	public void showlist_view(ListSelectionListener ac) {
	table.getSelectionModel().addListSelectionListener(ac);
	}
	
	
	
	
	

}
