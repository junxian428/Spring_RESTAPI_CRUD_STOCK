package D210044.Java2.StockManagement.RESTAPI4CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    //Listall()
    //Save()
    //Get()
    //Delete()
    public List<Stock> listAll() {
        return stockRepository.findAll();
    }

    public void save(Stock stock) {
        stockRepository.save(stock);
    }

    public Stock get(Integer id) {
        return stockRepository.findById(id).get();
    }

    public void delete(Integer id) {
        stockRepository.deleteById(id);
    }


}
