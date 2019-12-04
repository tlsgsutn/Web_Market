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
      phone.setDescription("RTX 2080 Ti, 12nm, 1350 MHz �ν�Ʈ 1755MHz, 4352��, PCIe3.0x16, GDDR6(DDR6), 14000MHz, 11GB, 352-bit, HDMI, DP, USB Type-C, �ִ� ����� 4��, �ִ� 300W, �����Ŀ� 650W, ������:17������, 3�� ��, 327mm, ���÷���Ʈ, LED ����Ʈ, MYSTIC LIGHT");
      phone.setCategory("Graphics card");
      phone.setManufacturer("MSI");
      phone.setUnitsInStock(10);
      phone.setCondition("new");
      phone.setFilename("P0001.png");

      product notebook = new product("P0002", "���� �ھ�i7-9���� 9700K (Ŀ�Ƿ���ũ-R)", 444000);
      notebook.setDescription("����(����1151v2) , 14nm , ��Ÿ(8)�ھ� , ������ 8�� , 3.60GHz , 12MB , 64��Ʈ , 95W , DDR4 , 2666MHz , ���� UHD 630 , 350MHz , ������");
      notebook.setCategory("CPU");
      notebook.setManufacturer("����");
      notebook.setUnitsInStock(10);
      notebook.setCondition("new");
      notebook.setFilename("P0002.jpg");

      product tablet = new product("P0003", "ASUS TUF Z390-PLUS GAMING ���̺���", 210150);
      tablet.setDescription("����(����1151v2) , (����) Z390 , ATX (30.5x24.4cm) , DDR4 , �޸� �뷮: �ִ� 64GB , XMP , ������ , VGA ����: PCIe3.0 x16 , GPU ���: CrossFire X , �׷��� ���: HDMI , DP , PCIe ����: 6�� , M.2: 2�� , SATA3: 6�� , PS/2: 2�� , USB 3.1 Gen 1: �ĸ� 4�� , USB 3.1 Gen 2: �ĸ� 2�� , �Ⱑ��Ʈ LAN , LED ����Ʈ , LED ��� , AURA SYNC");
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