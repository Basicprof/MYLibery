package ПарсингJCOUP;


public class ПарсингHTML {
    public static void main(String[] args) {
    List<Article> articleList = new ArrayList<>();
    Document document = Jsoup.connect("http://4pda.ru").get();
    Elements elements = doc.getElemet
    }
   class Article {
        private String url;
        private String name;
          public Article(String url,String name){
              this.url =url;
              this.name =name;
          }
        public String setName() {
         }
  public String setUrl() {
        }
        public String getUrl() {
            return url;
        }
        public String getName() {
            return name;
        }
      }
}