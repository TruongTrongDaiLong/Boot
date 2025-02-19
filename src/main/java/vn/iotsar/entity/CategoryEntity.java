package vn.iotsar.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "categories")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryid")
	private Integer categoryId;

	@Column(name = "categoryname", columnDefinition = "nvarchar(200) not null")
	@NotEmpty(message = "Không được phép rỗng")
	private String categoryName;

	public Object getCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategoryName(Object categoryId2) {
		// TODO Auto-generated method stub
		
	}
	
}