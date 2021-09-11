package com.feliz.felizdsvendassds4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.feliz.felizdsvendassds4.dto.SaleSuccessDTO;
import com.feliz.felizdsvendassds4.dto.SaleSumDTO;
import com.feliz.felizdsvendassds4.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.feliz.felizdsvendassds4.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.feliz.felizdsvendassds4.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();


}
