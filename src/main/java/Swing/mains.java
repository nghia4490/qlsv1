package Swing;

public class mains {
	public static void main(String[] args) {
		
		try {
		thanhvien_view view = new thanhvien_view();
		thanhvien_dao dao = new thanhvien_dao();
		thanhvien_model_table model = new thanhvien_model_table(dao.getAll());
					
				controller c = new controller(view, model)	;
				c.showAll();
					
					
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
