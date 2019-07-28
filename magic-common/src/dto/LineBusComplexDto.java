package dto;

import java.sql.Date;

public class LineBusComplexDto {
	private String idLine;
	private String diemDi;
	private String diemDen;
	private String hangGhe;
	private Integer soGheTrong;
	private Integer price;
	private String idBus;
	private String thoiGianKhoiHanh;
	private String thoiGianDuKienDen;
	
	
	

	public String getThoiGianKhoiHanh() {
		return thoiGianKhoiHanh;
	}

	public void setThoiGianKhoiHanh(String thoiGianKhoiHanh) {
		this.thoiGianKhoiHanh = thoiGianKhoiHanh;
	}

	public String getThoiGianDuKienDen() {
		return thoiGianDuKienDen;
	}

	public void setThoiGianDuKienDen(String thoiGianDuKienDen) {
		this.thoiGianDuKienDen = thoiGianDuKienDen;
	}

	public String getIdBus() {
		return idBus;
	}

	public void setIdBus(String idBus) {
		this.idBus = idBus;
	}

	public String getIdLine() {
		return idLine;
	}

	public void setIdLine(String idLine) {
		this.idLine = idLine;
	}

	public String getDiemDi() {
		return diemDi;
	}

	public void setDiemDi(String diemDi) {
		this.diemDi = diemDi;
	}

	public String getDiemDen() {
		return diemDen;
	}

	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}

	public String getHangGhe() {
		return hangGhe;
	}

	public void setHangGhe(String hangGhe) {
		this.hangGhe = hangGhe;
	}

	public Integer getSoGheTrong() {
		return soGheTrong;
	}

	public void setSoGheTrong(Integer soGheTrong) {
		this.soGheTrong = soGheTrong;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}