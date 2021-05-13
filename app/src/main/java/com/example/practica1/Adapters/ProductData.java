package com.example.practica1.Adapters;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductData {
    public String name = "";
    public String price = "";
    public String description = "";
    public String image = "";
    public String company = "";

    public static ProductData[] SAMSUNG_DATA = {
            new ProductData("Samsung Galaxy S8", "500$", "El Samsung Galaxy S8 es un teléfono inteligente de gama alta fabricado por Samsung Electronics. El dispositivo móvil fue presentado el 29 de marzo de 2017.", "galaxys8", "samsung"),
            new ProductData("Samsung Galaxy S9", "650$", "El Galaxy S9 cuenta con una pantalla de 5.8 pulgadas a 1440 x 2960 pixels de resolución, procesador Snapdragon 845 o Exynos 9810, 4GB de RAM, 64GB de almacenamiento, cámara principal de 12 MP, cámara frontal de 8 MP, batería de 3000 mAh y Android 8.0 Oreo.", "galaxys9", "samsung"),
            new ProductData("Samsung Galaxy S10", "660$", "El Samsung Galaxy S10 llega en el 2019 mejorando en varios aspectos al Galaxy S9. El Galaxy S10 tiene una pantalla QHD+ Dynamic AMOLED de 6.1 pulgadas, y está potenciado por el nuevo procesador Exynos 9820 de ocho núcleos o bien un Snapdragon 855, con 8GB de RAM y 128GB o 512GB de almacenamiento.", "galaxys10", "samsung"),
            new ProductData("Samsung Galaxy S20", "800$", "El Samsung Galaxy S20 cuenta con una batería de 4.000mAh y carga rápida de 25W. La cifra no es espectacular, pero tampoco parece insuficiente sobre el papel para un terminal de 6.2 pulgadas. No obstante, la gestión energética del procesador Exynos y los 120Hz pueden jugar una mala pasada.", "galaxys20", "samsung"),
            new ProductData("Samsung Galaxy S21", "950$", "Basta con echar un vistazo al nuevo Samsung Galaxy S21 para darse cuenta de que aunque el frontal es muy parecido, en la parte trasera hay un cambio de diseño bastante importante. Al menos en lo que respecta al módulo de cámaras, que ahora cuenta con un marco bastante distintivo y de diferentes colores en función de qué color elijamos para el teléfono móvil.", "galaxys21", "samsung"),};

    public static ProductData[] APPLE_DATA = {
            new ProductData("iPad Pro", "400$", "La experiencia iPad definitiva. Ahora con el rendimiento increíble del chip M1, una pantalla XDR espectacular y conexión 5G ultrarrápida. Abróchate el cinturón.", "ipadpro", "apple"),
            new ProductData("iPad Air", "400$", "El iPad Air hace más que un ordenador y usarlo es tan fácil que a veces parece magia. Y con las nuevas prestaciones es más versátil que nunca.", "ipadair", "apple"),
            new ProductData("iPhone 7", "400$", "Procesador A10 Fusion de cuatro núcleos a 2,34 GHz de 64 bits. Coprocesador de movimiento M10 integrado.", "iphone7", "apple"),
            new ProductData("iPhone 8", "450$", "El Apple iPhone 8 es la nueva edición del iPhone para el 2017, salteando la serie S del iPhone 7. Esta vez, el iPhone 8 cuenta con un panel trasero de vidrio, que habilita el soporte para carga inalámbrica.", "iphone8", "apple"),
            new ProductData("iPhone X", "550$", "La pantalla del iPhone X tiene esquinas redondeadas que rematan el diseño curvo del teléfono, y esas esquinas se encuentran dentro de un rectángulo estándar. Si se mide el rectángulo estándar, la pantalla tiene 5,85 pulgadas en diagonal (la superficie real de visión es inferior).", "iphonex", "apple"),
            new ProductData("iPhone XS", "675$", "El Apple iPhone XS es el sucesor del iPhone X que debutara el pasado año. Con una pantalla Super Retina OLED de 5.8 pulgadas, el iPhone XS está potenciado por el nuevo chip A12 Bionic de Apple, con opciones de almacenamiento interno de 64GB, 256GB o 512GB.", "iphonexs", "apple"),
            new ProductData("iPhone 11", "700$", "Resistencia a las salpicaduras, el agua y el polvo. Calificación IP68 según la norma IEC 60529 (hasta 2 metros de profundidad durante un máximo de 30 minutos).", "iphone11", "apple"),
            new ProductData("iPhone 11 Pro", "725$", "Con una pantalla OLED Super Retina XDR, el iPhone 11 Pro está potenciado por un procesador A13 Bionic de Apple, con opciones de almacenamiento de 64GB, 256GB o 512GB. La cámara posterior del iPhpne 11 Pro es triple.", "iphone11pro", "apple"),
            new ProductData("iPhone 12", "820$", "El iPhone 12 incluye conexión 5G, el chip A14 Bionic y una pantalla Super Retina XDR el doble de brillante y resistente.", "iphone12", "apple"),
            new ProductData("iPhone 12 Pro", "860$", "El Apple iPhone 12 Pro representa a los iPhone más avanzados de la serie 12. Con una pantalla de 6.1 pulgadas de tecnología OLED, el iPhone 12 Pro está potenciado por el procesador A14 Bionic de Apple, junto con opciones de 128GB, 256 o 512GB de almacenamiento interno no expandible.", "iphone12pro", "apple"),
            new ProductData("iPhone 12 Pro Max", "980$", "El Apple iPhone 12 Pro Max es la variante con mayor tamaño de pantalla de la serie iPhone 12. Con una pantalla OLED de 6.7 pulgadas, el iPhone 12 Pro Max cuenta con un procesador Apple A14 Bionic con opciones de 128GB, 256GB, o 512GB de almacenamiento, cámara cuádruple con tres lentes de 12 megapixels más un lente TOF 3D de tecnología LiDAR, cámara selfie de 12 megapixels, estabilización de imagen, zoom óptico 5x, parlantes stereo, carga rápida e inalámbrica por MagSafe para iPhone o protocolo Qi, resistencia al polvo y agua con certificación iP68, y corre iOS 14.", "iphone12promax", "apple"),};

    public static ProductData[] HUAWEI_DATA = {
            new ProductData("Huawei Mate X", "2550$", "El Huawei Mate X es el primer smartphone desplegable de Huawei. ... Por dentro, el Mate X cuenta con un chipset Kirin 980 con 8GB de memoria RAM y 512GB de almacenamiento interno, y vuelve a contar con la certificación de Leica para su cámara triple de 40MP + 16MP + 8MP.", "matex", "huawei"),
            new ProductData("Huawei Mate 8", "200$", "Las dimensiones del Huawei Mate 8 son: 80,6 mm de ancho, 157,1 mm de alto y 7,9 mm de grosor en su perfil, mientras que su peso es de 185 g. El Huawei Mate 8 tiene un tamaño de pantalla de 6\" , con una resolución de 1920x1080. La pantalla es de tipo LCD IPS NEO. Tiene una densidad de píxeles de 368 ppp.", "mate8", "huawei"),
            new ProductData("Huawei P8", "180$", "En cuanto a características, cuenta con una pantalla 1080p de 5.2 pulgadas, procesador octa-core Kirin 930 a 2GHz, 3GB de RAM, 16GB de almacenamiento interno, cámara trasera de 13 megapixels con OIS, cámara frontal de 8 MP, y corre Android 5.0 Lollipop.", "p8", "huawei"),
            new ProductData("Huawei Mate 9", "450$", "Dispone de un procesador Hisilicon Kirin 960 de ocho núcleos a 2.4 x 1.8 GHz. Tiene una pantalla de IPS LCD de 5.9 pulgadas con 1080 x 1920 píxeles de resolución. Asimismo, incluye dos cámaras. La ubicada en la parte de atrás es dual y tiene 20 + 12 megapíxeles óptica Leica, autofoco por láser y flash LED dual.", "mate9", "huawei"),
            new ProductData("Huawei P9", "400$", "En cuanto a características, posee una pantalla 1080p de 5.2 pulgadas, procesador Kirin 955 octa-core, versiones de 2GB de RAM y 32GB de ROM o bien 3GB de RAM y 64GB de ROM, cámara frontal de 8 megapixels, y batería de 3000 mAh, corriendo Android 6.0 Marshmallow.", "p9", "huawei"),
            new ProductData("Huawei Mate 10", "500$", "El Huawei Mate 10 es la nueva generación de la serie Mate de Huawei, con una pantalla FullView de 5.9 pulgadas a una resolución de 2560 x 1440 pixels. El Mate 10 está potenciado por un procesador Kirin 970 octa-core, con 4GB de RAM y 64GB de almacenamiento interno ampliable.", "mate10", "huawei"),
            new ProductData("Huawei P10", "420$", "El P10 cuenta con una pantalla Full HD de 5.1 pulgadas, procesador octa-core Kirin 960, 4GB de RAM, 64GB de almacenamiento interno expandible, cámara dual Leica de dos sensores: 13 MP y 20 MP monocromático, mientras que al frente cuenta con una cámara de 8 megapixels.", "p10", "huawei"),
            new ProductData("Huawei Mate 20", "560$", "El Mate 20 cuenta con una pantalla Full HD+ de 6.53 pulgadas, potenciado por un procesador Kirin 980 octa-core acompañado de 4GB o 6GB de RAM con 128GB de almacenamiento interno, expandible mediante tarjeta de memoria NM de hasta 256GB.", "mate20", "huawei"),
            new ProductData("Huawei P20", "570$", "Dar opciones al usuario es lo que se ha propuesto Huawei con sus nuevos modelos de la serie P. Este 2018, la serie Huawei P20 no se compone como años anteriores del modelo básico y la versión Lite. A este dúo se ha unido el Huawei P20 Pro que ya probamos. Hoy le llega el turno al Huawei P20, con nuevo diseño y doble cámara, y del que os vamos a contar qué nos ha parecido y cuál es su rol dentro de la gama alta de referencia de 2018.", "p20", "huawei"),
            new ProductData("Huawei Mate 30", "620$", "El diseño del Mate 30 es muy estilizado, con mucho cristal (gran parte ocupado por la pantalla) en la parte frontal y un módulo trasero de forma circular en el que se encuentran las cámaras. El notch es de tipo gota. La pantalla del Mate 30 es un panel OLED con formato 18,7:9 que cuenta con una resolución FullHD+. Esto se traduce en 2.244 x 1.080 píxeles, y tiene la capacidad de reproducir contenido HDR.", "mate30", "huawei"),
            new ProductData("Huawei P30", "640$", "El diseño del Huawei P30 es muy similar al del P20, con la excepción de contar con un notch de tipo gota. Se trata de un cuerpo unibody de aluminio con trasera de cristal. El módulo de la doble cámara sobresale y no está ubicado en la parte central del teléfono, sino donde estaba en los P20. La pantalla del Huawei P30 cuenta con un panel AMOLED con soporte HDR. Cuenta con una resolución FullHD+, que se traduce en 2.340 x 1.080. La densidad de píxeles es de 422 píxeles por pulgada y el panel es de 6,1''. Cuenta con lector de huellas en pantalla.", "p30", "huawei"),
            new ProductData("Huawei Mate 40", "850$", "La pantalla del Mate 40 es una OLED flexible de 6,5 pulgadas de diagonal con resolución de 2.376 x 1.080 píxeles, un FullHD+ con ratio 18.7:9. Es compatible con contenidos HDR además de DCI-P3 y tiene una velocidad de refresco de 90Hz. El refresco del panel táctil es de 240Hz.", "mate40", "huawei"),
            new ProductData("Huawei P40", "860$", "Descubre la auténtica velocidad con el revolucionario chipset 990 5G. La Triple Cámara Leica Ultra Vision con capacidad mejorada por IA revolucionará tu forma de entender la fotografía y el vídeo. \n\n La sofisticación hecha Smartphone. \n\n Reflejando la pureza de la naturaleza, el HUAWEI P40 adopta los colores sólidos de Deep Sea Blue, Ice White, Black, Blush Gold y Silver Forest. El acabado mate refractivo acentúa una sensación etérea de profundidad que revela elegancia y paz interior en cada tono.", "p40", "huawei"),};

    public static ProductData[] MICROSOL_DATA = {
            new ProductData("Microsol Superfisie I", "110$", "Porro paulo persequeris id pri, eu nostro quaerendum deterruisset ius, deserunt complectitur quo id.", "superfisie1", "microsol"),
            new ProductData("Microsol Superfisie II", "220$", "Ad veri posse cotidieque nam, quo in hinc duis argumentum.", "superfisie2", "microsol"),
            new ProductData("Microsol Superfisie III", "330$", "Molestie expetenda vulputate ad eam, has id nullam liberavisse, at vis esse nostrud forensibus.", "superfisie3", "microsol"),
            new ProductData("Microsol Superfisie IV", "440$", "Mei ridens iisque eu, quo quem case deseruisse at, his dicam deseruisse ei.", "superfisie4", "microsol"),
            new ProductData("Microsol Superfisie V", "550$", "Tantas maluisset consequuntur per ut, qui probo doming signiferumque ei.", "superfisie5", "microsol"),
            new ProductData("Microsol Superfisie VI", "660$", "Probo habemus at quo, vim ut zril civibus, sea at veri blandit.", "superfisie6", "microsol"),
            new ProductData("Microsol Superfisie VII", "770$", "Nominavi periculis conclusionemque an mea.", "superfisie7", "microsol"),
            new ProductData("Microsol Superfisie VIII", "880$", "At simul oportere constituto est, eum maiorum neglegentur conclusionemque et, ei pri debet feugait scaevola.", "superfisie8", "microsol"),
            new ProductData("Microsol Superfisie IX", "990$", "Commodo habemus invenire vix cu. In his dictas deseruisse, vix id putant facilisi suavitate.", "superfisie9", "microsol"),
            new ProductData("Microsol Superfisie X", "1010$", "Voluptatum inciderint consequuntur ex pri, in pri nibh reprimique vituperatoribus, te impetus quaestio vel.", "superfisie10", "microsol"),
            new ProductData("Microsol Superfisie XI", "1010$", "Eam ex integre quaeque bonorum, ea assum solet scriptorem pri, et usu nonummy accusata interpretaris.", "superfisie11", "microsol"),
            new ProductData("Microsol Superfisie XII", "1010$", "Debitis necessitatibus est no.", "superfisie12", "microsol"),
            new ProductData("Microsol Superfisie XIII", "1010$", "Eu probo graeco eum, at eius choro sit, possit recusabo corrumpit vim ne.", "superfisie13", "microsol"),
            new ProductData("Microsol Superfisie XIV", "1010$", "Noster diceret delicata vel id.", "superfisie14", "microsol"),};

    public static ProductData[] CUSTOM_DATA = {};

    public static ProductData[][] PRODUCT_DATA = {APPLE_DATA, SAMSUNG_DATA, HUAWEI_DATA, MICROSOL_DATA};

    public void addProduct(String productName, String productPrice, String productDescription, String companyName){
        ProductData newProduct = new ProductData(productName, productPrice, productDescription,"", companyName.toLowerCase());
        switch (companyName){
            case "Apple":
                APPLE_DATA = this.appendValue(APPLE_DATA, newProduct);
                break;
            case "Samsung":
                SAMSUNG_DATA = this.appendValue(SAMSUNG_DATA, newProduct);
                break;
            case "Huawei":
                HUAWEI_DATA = this.appendValue(HUAWEI_DATA, newProduct);
                break;
            case "Microsol":
                MICROSOL_DATA = this.appendValue(MICROSOL_DATA, newProduct);
                break;
            default:
                CUSTOM_DATA = this.appendValue(CUSTOM_DATA, newProduct);
                break;
        }

    }

    private ProductData[] appendValue(ProductData[] productArray, ProductData productData){
        ArrayList<ProductData> temp = new ArrayList<ProductData>(Arrays.asList(productArray));
        temp.add(productData);
        return (ProductData[]) temp.toArray();
    }

    private void reloadDatabase(){
        PRODUCT_DATA = new ProductData[][]{APPLE_DATA, SAMSUNG_DATA, HUAWEI_DATA, MICROSOL_DATA, CUSTOM_DATA};
    }

    public ProductData(String name, String price, String description, String image, String company){
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.company = company;
    }
}
