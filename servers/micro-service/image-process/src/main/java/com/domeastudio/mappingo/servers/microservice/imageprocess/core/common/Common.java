/**
 * @Common.java
 * @Version 1.0 2010.03.05
 * @Author Xie-Hua Sun
 */

package com.domeastudio.mappingo.servers.microservice.imageprocess.core.common;

//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
//
//import javax.imageio.ImageIO;
//import javax.imageio.ImageReader;
//import javax.imageio.metadata.IIOMetadata;
//import javax.imageio.stream.FileImageInputStream;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.awt.image.PixelGrabber;
//import java.io.*;
//import java.net.URL;
//import java.util.NoSuchElementException;

public class Common {
//    static {
//        ImageIO.scanForPlugins();
//    }
//
//    //关于图像文件和像素--------------------------
//    public int[] grabber(Image image, int width, int height) {
//        int[] pixel = new int[width * height];
//        try {
//            PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, width, height, pixel, 0, width);
//            pixelGrabber.grabPixels();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return pixel;
//    }
//
//    /**
//     * 根据路径打开图像
//     *
//     * @param imagePath
//     * @return
//     */
//    public Image openImage(String imagePath) throws IOException {
//        return openImageFromStringOrURL(imagePath, null);
//    }
//
//    //读取tiff文件到 ImageReader Object[0]：ImageReader ,Object[1]:FileImageInputStream
//    private Object[] readTiff(File tifFile) {
//
//        ImageReader reader = null;
//        FileImageInputStream fis = null;
//        Object[] res = null;
//        try {
//            reader = ImageIO.getImageReadersByFormatName("tiff").next();
//            fis = new FileImageInputStream(tifFile);
//            reader.setInput(fis);
//            res = new Object[]{reader, fis};
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//        }
//        return res;
//    }
//
//    //读取tiff文件到 BufferedImage
//    public Image openImageAsTiff(File tifFile, long[] dpiData) {
//        ImageReader reader = null;
//        FileImageInputStream fis = null;
//        BufferedImage res = null;
//        try {
//            Object[] src = readTiff(tifFile);
//            if (src == null) {
//                return null;
//            }
//            reader = (ImageReader) src[0];
//            fis = (FileImageInputStream) src[1];
//            if (reader != null) {
//                int numPages = reader.getNumImages(true);
//                if (numPages > 0) {
//                    long[] dpiArr = getTiffDPI(reader, 0);
//                    dpiData[0] = dpiArr[0];
//                    dpiData[1] = dpiArr[1];
//                    res = reader.read(0);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//            if (reader != null) {
//                reader.dispose();
//            }
//            if (fis != null) {
//                try {
//                    fis.flush();
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return res;
//    }
//
//    //获取tiff dpi
//    private long[] getTiffDPI(ImageReader reader, int index) {
//        long[] dpi = new long[2];
//        IIOMetadata meta = null;
//        try {
//            meta = reader.getImageMetadata(index);
//            org.w3c.dom.Node n = meta.getAsTree("javax_imageio_1.0");
//            n = n.getFirstChild();
//            while (n != null) {
//                if (n.getNodeName().equals("Dimension")) {
//                    org.w3c.dom.Node n2 = n.getFirstChild();
//                    while (n2 != null) {
//                        if (n2.getNodeName().equals("HorizontalPixelSize")) {
//                            org.w3c.dom.NamedNodeMap nnm = n2.getAttributes();
//                            org.w3c.dom.Node n3 = nnm.item(0);
//                            float hps = Float.parseFloat(n3.getNodeValue());
//                            dpi[0] = Math.round(25.4f / hps);
//                        }
//                        if (n2.getNodeName().equals("VerticalPixelSize")) {
//                            org.w3c.dom.NamedNodeMap nnm = n2.getAttributes();
//                            org.w3c.dom.Node n3 = nnm.item(0);
//                            float vps = Float.parseFloat(n3.getNodeValue());
//                            dpi[1] = Math.round(25.4f / vps);
//                        }
//                        n2 = n2.getNextSibling();
//                    }
//                }
//                n = n.getNextSibling();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return dpi;
//    }
//
//    private Image openImageFromStringOrURL(String imagePath, URL imageUri) throws IOException {
//        Image image = null;
//        if (imagePath == null && imageUri == null) {
//            return image;
//        }
//        if (imagePath != null) {
//            //用MediaTracker跟踪图像加载
//            image = ImageIO.read(new File(imagePath));
//            //tracker.addImage(image, 0);
//        } else if (imageUri != null) {
//            image = ImageIO.read(imageUri);
//            //tracker.addImage(image, 0);
//        }
////        //等待图像完成加载
////        try {
////            tracker.waitForID(0);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        return image;
//    }
//
//    /**
//     * 根据统一资源定位地址打开图像
//     *
//     * @param imageUri
//     * @return
//     */
//    public Image openImage(URL imageUri) throws IOException {
//        return openImageFromStringOrURL(null, imageUri);
//    }
//
//    public int[] toPixels(int[][] pix, int width, int height) {
//        int[] pi = new int[width * height];
//        for (int j = 0; j < height; j++) {
//            for (int i = 0; i < width; i++) {
//                int c = pix[i][j];
//                if (c < 0) c = c + 256;
//                pi[i + j * width] = (255 << 24) | (c << 16) | (c << 8) | c;
//            }
//        }
//        return pi;
//    }
//
//
//    public int[] toPixels(double[][] inIm, int width, int height) {
//        int r;
//        int[] pix = new int[width * height];
//        for (int j = 0; j < height; j++) {
//            for (int i = 0; i < width; i++) {
//                r = (int) inIm[i][j];
//                if (r < 0) r = 0;
//                else if (r > 255) r = 255;
//                pix[i + j * width] = 255 << 24 | r << 16 | r << 8 | r;
//            }
//        }
//        return pix;
//    }
//
//    //一维double数据转变为图像序列
//    public int[] toPixels(double[] inIm, int width, int height) {
//        int r;
//        int[] pix = new int[width * height];
//        for (int j = 0; j < height; j++) {
//            for (int i = 0; i < width; i++) {
//                r = (int) inIm[i + j * width];
//                if (r < 0) r = 0;
//                else if (r > 255) r = 255;
//                pix[i + j * width] = 255 << 24 | r << 16 | r << 8 | r;
//            }
//        }
//        return pix;
//    }
//
//    //图像序列pix阈值分割
//    public int[] thSegment(int[] pix, int width, int height, int threshold) {
//        int[] im = new int[width * height];
//        int t;
//        for (int i = 0; i < width * height; i++) {
//            t = pix[i] & 0xff;
//
//            if (t > threshold)
//                im[i] = (255 << 24) | (255 << 16) | (255 << 8) | 255;//背景色
//            else
//                im[i] = (255 << 24) | (0 << 16) | (0 << 8) | 0;      //前景色为
//        }
//        return im;
//    }
//
//    //将RGB图像序列pix变为2值图像序列im
//    public byte[] rgb2Binary(int[] pix, int width, int height) {
//        byte[] im = new byte[width * height];
//
//        for (int i = 0; i < width * height; i++)
//            if ((pix[i] & 0xff) > 128)
//                im[i] = 0;   //背景色为0
//            else
//                im[i] = 1;   //前景色为1
//        return im;
//    }
//
//    //将ARGB图像序列pixels变为2值图像序列im
//    public byte[] toBinary(int[] pix, int width, int height) {
//        byte[] im = new byte[width * height];
//        for (int i = 0; i < width * height; i++)
//            if ((pix[i] & 0xff) > 128)
//                im[i] = 0;   //背景色为0
//            else
//                im[i] = 1;   //前景色为1
//        return im;
//    }
//
//    //将2值图像序列bw变为RGB图像序列pix
//    public int[] binary2Rgb(byte[] bw, int width, int height) {
//        int r, g, b;
//        int[] pix = new int[width * height];
//
//        for (int i = 0; i < width * height; i++) {
//            if (bw[i] == 0) {
//                r = 255;
//                g = 255;
//                b = 255;
//            } else if (bw[i] == 1) {
//                r = 0;
//                g = 0;
//                b = 0;
//            } else {
//                r = 255;
//                g = 0;
//                b = 0;
//            }
//            pix[i] = (255 << 24) | (r << 16) | (g << 8) | b;
//        }
//        return pix;
//    }
//
//    //将字节数组pix转化为图像序列pixels
//    public int[] byte2int(byte[][] pix, int width, int height) {
//        int[] p = new int[width * height];
//
//        for (int j = 0; j < height; j++) {
//            for (int i = 0; i < width; i++) {
//                int c = pix[i][j];
//                if (c < 0) c = c + 256;
//                p[i + j * width] = (255 << 24) | (c << 16) | (c << 8) | c;
//            }
//        }
//        return p;
//    }
//
//    //将2值图像矩阵image2变为ARGB图像序列pixels
//    public int[] toARGB(int[] bw, int width, int height) {
//        int r;
//        int[] pix = new int[width * height];
//
//        for (int i = 0; i < width * height; i++) {
//            if (bw[i] == 0) r = 255;
//            else r = 0;
//            pix[i] = (255 << 24) | (r << 16) | (r << 8) | r;
//        }
//
//        int x = bw[width * height + 2];
//        int y = bw[width * height + 3];
//
//        //用红色小方块标注链码起始点
//        if (x != -1 && y != -1) {
//            for (int i = -2; i < 3; i++)
//                for (int j = -2; j < 3; j++)
//                    pix[(x + i) + (y + j) * width] = (255 << 24) | (255 << 16) | (0 << 8) | 0;
//        }
//        return pix;
//    }
//
//    //将2值图像矩阵image2变为ARGB图像序列pixels
//    public int[] toARGB(byte[] bw, int x, int y, int width, int height) {
//        int r;
//        int[] pix = new int[width * height];
//
//        for (int i = 0; i < width * height; i++) {
//            if (bw[i] == 0) r = 255;
//            else r = 0;
//            pix[i] = (255 << 24) | (r << 16) | (r << 8) | r;
//        }
//
//        //用红色小方块标注链码起始点
//        if (x != -1 && y != -1) {
//            for (int i = -2; i < 3; i++)
//                for (int j = -2; j < 3; j++)
//                    pix[(x + i) + (y + j) * width] = (255 << 24) | (255 << 16) | (0 << 8) | 0;
//        }
//        return pix;
//    }
//
//    public int[] byte2ARGB(byte[][] bw, int width, int height) {
//        int[] pix = new int[width * height];
//        int r, g, b;
//
//        for (int j = 0; j < height; j++) {
//            for (int i = 0; i < width; i++) {
//                if (bw[i][j] == 0) {
//                    r = 255;
//                    g = 255;
//                    b = 255;
//                } else {
//                    r = 255;
//                    g = 0;
//                    b = 0;
//                }
//                pix[i + j * width] = (255 << 24) | (r << 16) | (g << 8) | b;
//            }
//        }
//        return pix;
//    }
//
//    //基本计算------------------------------------
//
//    //计算数组d最大值
//    public int maximum(int[] d) {
//        int m = 0;
//        for (int i = 0; i < 256; i++)
//            if (d[i] > m) m = d[i];
//        return m;
//    }
//
//    //数组h规范化为[0,255]
//    public int[] normalize(int[] h, int max) {
//        for (int i = 0; i < 255; i++)
//            h[i] = h[i] * 255 / max;
//        return h;
//    }
//
//    public int[] getHist(int[] pix, int width, int height) {
//        int[] hist = new int[256];
//        for (int i = 0; i < width * height; i++) {
//            int grey = pix[i] & 0xff;
//            hist[grey]++;
//        }
//        return hist;
//    }
//
//    /*---------------------------------------------*
//     *计算峰值信噪比
//     *pin1[] -- 原图像矩阵
//     *pix2[] -- 输出图像矩阵
//     *---------------------------------------------*/
//    public double PSNR(int[] pix1, int[] pix2, int width, int height) {
//        double err, temp, psnr;
//
//        err = 0.0;
//        for (int i = 0; i < width * height; i++) {
//            temp = (pix1[i] & 0xff) - (pix2[i] & 0xff);
//            err += temp * temp;
//        }
//        err = Math.sqrt(err);
//        System.out.print(Math.log(10));
//        psnr = 20 * Math.log(255 * 255 / err) / Math.log(10);
//        return psnr;
//    }
//
//    //其它======================================
//
//    //存储JPEG图像
//    public static void saveImageAsJPEG(BufferedImage image, File file) {
//        try {
//            OutputStream out = new FileOutputStream(file);
//            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//            JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(image);
//            param.setQuality(1.0f, false);
//            encoder.encode(image, param);
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//    private static void saveImage(BufferedImage image, String imageFormat, File file) {
//        if (file != null && image != null) {
//            try {
//                ImageIO.write(image, imageFormat, file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void saveImageAsPNG(BufferedImage image, String filePath) {
//        if (filePath != null && image != null) {
//            File file = new File(filePath);
//            saveImage(image, "png", file);
//        }
//    }
//
//    public static void saveImageAsGIF(BufferedImage image, String filePath) {
//        if (filePath != null && image != null) {
//            File file = new File(filePath);
//            saveImage(image, "gif", file);
//        }
//    }
}
