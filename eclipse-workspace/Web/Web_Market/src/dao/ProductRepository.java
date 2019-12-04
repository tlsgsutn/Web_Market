package dao;

import java.util.ArrayList;

import dto.product;

public class ProductRepository {
   private ArrayList<product> listOfProducts = new ArrayList<product>();
   private static ProductRepository instance = new ProductRepository();
   
   public static ProductRepository getInstance() {
      return instance;
   }
   
   public ProductRepository() {
      product phone = new product("P0001", "GeForce RTX 2080 Ti", 1600000);
      phone.setDescription("RTX 2080 Ti, 12nm, 1350 MHz 부스트 1755MHz, 4352개, PCIe3.0x16, GDDR6(DDR6), 14000MHz, 11GB, 352-bit, HDMI, DP, USB Type-C, 최대 모니터 4개, 최대 300W, 정격파워 650W, 전원부:17페이즈, 3개 팬, 327mm, 백플레이트, LED 라이트, MYSTIC LIGHT");
      phone.setCategory("Graphics card");
      phone.setManufacturer("MSI");
      phone.setUnitsInStock(10);
      phone.setCondition("new");
      phone.setFilename("P0001.png");

      product notebook = new product("P0002", "인텔 코어i7-9세대 9700K (커피레이크-R)", 444000);
      notebook.setDescription("인텔(소켓1151v2) , 14nm , 옥타(8)코어 , 쓰레드 8개 , 3.60GHz , 12MB , 64비트 , 95W , DDR4 , 2666MHz , 인텔 UHD 630 , 350MHz , 옵테인");
      notebook.setCategory("CPU");
      notebook.setManufacturer("인텔");
      notebook.setUnitsInStock(10);
      notebook.setCondition("new");
      notebook.setFilename("P0002.jpg");

      product tablet = new product("P0003", "ASUS TUF Z390-PLUS GAMING 아이보라", 210150);
      tablet.setDescription("인텔(소켓1151v2) , (인텔) Z390 , ATX (30.5x24.4cm) , DDR4 , 메모리 용량: 최대 64GB , XMP , 옵테인 , VGA 연결: PCIe3.0 x16 , GPU 기술: CrossFire X , 그래픽 출력: HDMI , DP , PCIe 슬롯: 6개 , M.2: 2개 , SATA3: 6개 , PS/2: 2개 , USB 3.1 Gen 1: 후면 4개 , USB 3.1 Gen 2: 후면 2개 , 기가비트 LAN , LED 라이트 , LED 헤더 , AURA SYNC");
      tablet.setCategory("Main board");
      tablet.setManufacturer("ASUS");
      tablet.setUnitsInStock(10);
      tablet.setCondition("new");
      tablet.setFilename("P0003.jpg");

      listOfProducts.add(phone);
      listOfProducts.add(notebook);
      listOfProducts.add(tablet);

   }

   public ArrayList<product> getAllProducts() {
      return listOfProducts;
   }

   public product getProductById(String productId) {
      product productById = null;

      for (int i = 0; i < listOfProducts.size(); i++) {
         product product = listOfProducts.get(i);
         if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
            productById = product;
            break;
         }
      }
      return productById;
   }
   
   public void addProduct(product product) {
      listOfProducts.add(product);
   }
}