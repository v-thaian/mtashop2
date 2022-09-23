package vn.fs.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistical {

	private int month;
	private Date date;
	private Double amount;
	private int count;

}
