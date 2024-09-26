package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dl.thanhvien;

public class controller {
	private thanhvien_view view ;
	private thanhvien_dao dao;
	 private thanhvien_model_table model;
	public controller(thanhvien_view view, thanhvien_model_table model) {
		super();
		this.view = view;
		this.model = model;
		dao = new thanhvien_dao();
	}
	 
	 
	public void showAll() {
		
		view.showlistTT(model);
		view.showlist_view(new fill());
		view.them_view(new them());
		view.sua_view(new sua());
		view.xoa_view(new xoa());
		view.timkiem_view(new timkiem());
		view.ghi_view(new ghi());
		view.huy_view(new huy());
		
		view.setVisible(true);
	}
	 
	class fill implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			view.fill();
			
		}
		
	}
	
	class them implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			thanhvien tv = view.infor();
			try {
				dao.insert(tv);
				view.showTB("them thanh cong");
				
				
			} catch (Exception e2) {
				view.showTB(e.toString());
			}
			
		}
		
	}
	
	class sua implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			thanhvien tv = view.infor();
			try {
				dao.update(tv);
				view.showTB("sua thanh cong");
				
				
			} catch (Exception e2) {
				view.showTB(e.toString());
			}
			
		}
		
	}
	
	class xoa implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			thanhvien tv = view.infor();
			try {
				dao.delete(tv);
				
				view.showTB("xoa thanh cong");
				
			} catch (Exception e2) {
				view.showTB(e.toString());
			}
			
		}
		
	}
	class ghi implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				
				view.clearTT();
				view.showlistTT(new thanhvien_model_table(dao.getAll()));
			
				
			} catch (Exception e2) {
				view.showTB(e.toString());
			}
			
		}
		
	}
	
	
	class huy implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.clearTT();
			
			
		}
		
	}
	
	class timkiem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			try {
				
				
				dao.get_ten(view.trave());
				view.clearTT();
				view.showlistTT(new thanhvien_model_table(dao.get_ten(view.trave())));
				
				
			} catch (Exception e2) {
				view.showTB(e.toString());
			}
			
			
		}
		
	}
	
	
	
	
	

}
