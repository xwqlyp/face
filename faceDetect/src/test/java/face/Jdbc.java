package face;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.junit.Test;

import com.bjym.common.ImageUtils;



public class Jdbc {


	@Test
	public void testAddGroup() throws Exception {
		Connection conn = JDBCUtilsConfig.getConnection();

		String sql = "select * from face_list";
		String sql1 = "select * from face_list";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("============================");
			while (rs.next()) {
				for (int i = 1; i <= col; i++) {
					System.out.print(rs.getString(i) + "\t");
					if ((i == 2) && (rs.getString(i).length() < 8)) {
						System.out.print("\t");
					}
				}
				System.out.println("");
			}
			System.out.println("============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	



	@Test
	public void testName() throws Exception {
		String url = "D:\\upload";
		// 检验文件夹是否存在
		ImageUtils.isFolderExists(url);
	}








}
