package D210044.Java2.StockManagement.RESTAPI4CRUD;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    
    @Autowired
    private StockService stockService;

    @GetMapping("/stocks")
    public List<Stock> list() {
        return stockService.listAll();
    }

    @GetMapping("/stocks/{id}")
    public ResponseEntity<Stock> get(@PathVariable Integer id) {
        try{
            Stock stock = stockService.get(id);
            return new ResponseEntity<Stock>(stock, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Stock>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/stocks")
    public void add(@RequestBody Stock stock) {
        stockService.save(stock);
    }
    
    @PutMapping("stocks/{id}")
    public ResponseEntity<?> update(@RequestBody Stock stock, @PathVariable Integer id) {
        try{
        Stock existStock = stockService.get(id);
        stockService.save(stock);
        return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/stocks/{id}")
    public void dete(@PathVariable Integer id) {
        stockService.delete(id);
    }
   

}
