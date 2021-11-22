package D210044.Java2.StockManagement.RESTAPI4CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Integer>{
    
}
