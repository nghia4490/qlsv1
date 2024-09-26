package Swing;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import dl.thanhvien;

public class thanhvien_model_table extends AbstractTableModel {

	private ArrayList<thanhvien> tv;
	private Object [][] data ;
	

	
	
	public thanhvien_model_table(ArrayList<thanhvien> tv) {
		super();
		this.tv = tv;
		data = new Object[tv.size()][];
		for(int i=0;i<data.length;i++) {
			thanhvien tvv= tv.get(i);
			Object [] row= {tvv.getId(),tvv.getMa(),tvv.getTen(),tvv.getEmail(),tvv.getDate(),tvv.getDc()};
			
			data[i] =row;
		}
		
		
		
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
	
	
	

}
