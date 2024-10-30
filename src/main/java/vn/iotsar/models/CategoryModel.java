package vn.iotsar.models;

import java.io.Serializable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer categoryId;
    private String categoryName;
    private Boolean isEdit = false;
	public boolean getIsEdit() {
		// TODO Auto-generated method stub
		return false;
	}
	public void setIsEdit(boolean b) {
		// TODO Auto-generated method stub
	}
}
