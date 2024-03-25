package com.eli.springbootvue.controller;

import com.alibaba.fastjson.JSON;
import com.eli.springbootvue.data.AjaxResult;
import com.eli.springbootvue.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import meta.data.OrderData;
import meta.data.OrderDetailData;
import meta.data.OrderDetailPriceData;
import meta.data.OrderUserData;
import meta.dto.ChannelOrderWaiterData;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.filters.Canvas;
import net.coobird.thumbnailator.geometry.Positions;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: tmind
 * @Date: 2024/2/26 14:29
 * @Description:
 */
@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {
    @GetMapping("/pic")
    public AjaxResult pushChannelPic() {
        String jsonPicUrlList = "[\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/168913221735b77f.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322170d9d55.jpeg\",\n" +
                "  \"https://yanxuan.nosdn.127.net/static-union/16891322178ae529.jpeg\"\n" +
                "]";
        List<String> picUrlList = JSON.parseArray(jsonPicUrlList, String.class);
        log.info("[op:getAlipayFileUrl] 图片数量:{}", picUrlList.size());
        List<String> alipayUrl = new ArrayList<>();
        List<File> alipayFiles = new ArrayList<>();
        for (String i : picUrlList) {
            String fileName = i.substring(i.lastIndexOf("."));
            URL url;
            File file = null;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                file = File.createTempFile(DateUtils.getCurrentTime() + "net_url", fileName);
                url = new URL(i);
                log.info("[op:getAlipayFileUrl] imageUrl:{}", i);
                inputStream = url.openStream();
                outputStream = new FileOutputStream(file);

                int bytesRead = 0;
                byte[] buffer = new byte[8192];
                while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                log.error("[op:getAlipayFileUrl] error:", e);
            } finally {
                try {
                    if (null != outputStream) {
                        outputStream.close();
                    }
                    if (null != inputStream) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            alipayFiles.add(file);
        }

        File mergeImg;
        File newFile;
        try {
            mergeImg = mergeImg(alipayFiles);
            newFile = newResizeImage(mergeImg, mergeImg.getName(), 2000, 1f, 750, 9999, true);
            List<File> files = cutImages(newFile, 3000, 3);
            System.out.println("files = " + files);
            // 将一张图片分割多个图片
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String filePath = "D:\\";
        String fileName = "test.png";
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(newFile);
            outputStream = new FileOutputStream(filePath + fileName);

            byte[] buffer = new byte[8192];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            log.error("[op:getAlipayFileUrl] error:", e);
        } finally {
            try {
                if (null != outputStream) {
                    outputStream.close();
                }
                if (null != inputStream) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return AjaxResult.ofSuccess();
    }

    /**
     * 将N个图片纵向合并为一个图片
     */
    private static File mergeImg(List<File> fileList) throws IOException {
        // Load n images into an array
        BufferedImage[] images = new BufferedImage[fileList.size()];
        for (int i = 0; i < fileList.size(); i++) {
            images[i] = ImageIO.read(fileList.get(i));
        }

        // Create a new BufferedImage object with a width equal to the sum of the widths of the n images,
        // and a height equal to the height of any one of the images
        BufferedImage joinedImage = new BufferedImage(images[0].getWidth(), images[0].getHeight() * fileList.size(),
                BufferedImage.TYPE_INT_ARGB);

        // Draw the n images onto the new BufferedImage object
        Graphics2D g2d = joinedImage.createGraphics();
        int y = 0;
        for (BufferedImage image: images) {
            g2d.drawImage(image, 0, y, null);
            y += image.getHeight();
        }
        g2d.dispose();

        // Save the joined image to a file
        File output = new File("joinedImage.png");
        ImageIO.write(joinedImage, "png", output);
        return output;
    }

    /**
     * 根据指定大小和指定精度压缩图片
     *
     * @param srcFile      原图
     * @param fileName     名称
     * @param desFileSize  指定图片大小，单位kb（压缩到多大以内）
     * @param accuracy     精度，递归压缩的比率，建议小于0.9
     * @param desMaxWidth  目标最大宽度
     * @param desMaxHeight 目标最大高度
     * @return 目标文件
     */
    public static File newResizeImage(File srcFile, String fileName, long desFileSize, double accuracy, int desMaxWidth, int desMaxHeight, boolean keepAspectRatio) {
        File newFile;
        try {
            long srcFileSize = srcFile.length();
            log.info("源图片大小：" + srcFileSize / 1024 + "kb");
            //获取图片信息
            BufferedImage bim = ImageIO.read(srcFile);
            int srcWidth = bim.getWidth();
            int srcHeight = bim.getHeight();
            log.info("源图片高：{}，宽：{}", srcHeight, srcWidth);
            //先转换成jpg
            Thumbnails.Builder<File> builder = Thumbnails.of(srcFile);
            if (srcWidth < desMaxWidth) {
                // 宽度小于目标宽度，图片不会放大，先将宽度放大到目标宽度，再缩小
                double v = (double) desMaxWidth / srcWidth + 1;
                File tempFile = new File("temp.jpg");
                builder.scale(v).toFile(tempFile);
                log.debug("放大图片倍数v:{}", v);
                BufferedImage temp = ImageIO.read(tempFile);
                log.debug("放大后目标图片高：{},宽：{}", temp.getHeight(), temp.getWidth());
                builder = Thumbnails.of(tempFile);
                srcHeight = temp.getHeight();
            }

            // 指定大小
            builder.size(desMaxWidth, srcHeight).keepAspectRatio(keepAspectRatio);
            // 写入到内存
            ByteArrayOutputStream bos = new ByteArrayOutputStream(); //字节输出流（写入到内存）
            builder.toOutputStream(bos);

            // 递归压缩，直到目标文件大小小于desFileSize
            byte[] bytes = compressPicCycle(bos.toByteArray(), desFileSize, accuracy);
            //压缩不到指定大小就舍弃
            if (bytes == null) {
                return null;
            }
            // 输出到文件
            newFile = File.createTempFile(DateUtils.getCurrentTime() + "net_url2", fileName.replaceAll("\\..*", "") + ".jpg");
            FileOutputStream fos = new FileOutputStream(newFile);
            fos.write(bytes);
            fos.close();

            log.info("目标图片大小" + newFile.length() / 1024 + "kb");
            BufferedImage temp = ImageIO.read(newFile);
            log.info("目标图片高：{},宽：{}", temp.getHeight(), temp.getWidth());
            log.info("图片压缩完成！");
        } catch (Exception e) {
            log.error("[op:newResizeImage] error:", e);
            return null;
        }
        return newFile;
    }

    private static byte[] compressPicCycle(byte[] bytes, long desFileSize, double accuracy) throws IOException {
        // File srcFileJPG = new File(desPath);
        long srcFileSizeJPG = bytes.length;
        log.info("压缩前大小：" + srcFileSizeJPG);
        log.info("压缩率" + accuracy);
        //压缩率小于0.1则舍弃
        if (accuracy <= 0.1) {
            return null;
        }
        // 计算宽高
        BufferedImage bim = ImageIO.read(new ByteArrayInputStream(bytes));
        int srcWidth = bim.getWidth();
        int srcHeight = bim.getHeight();
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //字节输出流（写入到内存）
        Thumbnails.of(new ByteArrayInputStream(bytes))
                .addFilter(new Canvas(srcWidth, srcHeight, Positions.CENTER, Color.WHITE))
                .size(srcWidth, srcHeight)
                .outputQuality(accuracy)
                .outputFormat("JPG")
                .toOutputStream(bos);
        log.info("压缩后大小：" + bos.toByteArray().length);
        // 2、判断大小，如果小于等于指定大小，返回结果，如果大于指定大小，继续压缩
        if (bos.toByteArray().length <= desFileSize * 1024) {
            return bos.toByteArray();
        }
        return compressPicCycle(bytes, desFileSize, accuracy - 0.2f);
    }

    private static int getSliceCount(int height, int desMaxHeight, int maxUploadImgNum) {
        if (height <= desMaxHeight) {
            return 1;
        }
        int sliceCount = height % desMaxHeight == 0 ? height / desMaxHeight : height / desMaxHeight + 1 ;
        return Math.min(sliceCount, maxUploadImgNum);
    }

    private static String getFileSuffix(String fileName) {
        // 查找最后一个"."的位置
        int dotIndex = fileName.lastIndexOf(".");

        // 如果找到了"."
        if (dotIndex!= -1) {
            // 返回从"."之后的所有字符，即文件名后缀
            return fileName.substring(dotIndex);
        } else {
            // 如果没有找到"."
            return "";
        }
    }

    public static List<File> cutImage(String inputImagePath, int sliceCount, int sliceWidth) {
        // 切割后的图片保存路径
        String outputFolderPath = "D:\\cut\\";
        File sourcePic = new File(inputImagePath);
        try {
            BufferedImage pic1 = ImageIO.read(sourcePic);
            int width = pic1.getWidth();
            int height = pic1.getHeight();
            //参数依次为，截取起点的x坐标，y坐标，截取宽度，截取高度
            BufferedImage pic2 = pic1.getSubimage(0, 0, width / 2, height / 2);

            //将截取的子图另行存储
            File desImage = new File("D:/cut/subjavaPic.png");
            ImageIO.write(pic2, "png", desImage);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return null;
    }

    /**
     * 将一张图片分割多个图片
     * @param srcFile           原图
     * @param desMaxHeight      目标最大高度
     * @param maxUploadImgNum   最大上传图片数量
     */
    public static List<File> cutImages(File srcFile, int desMaxHeight, int maxUploadImgNum) {
        // 切割后的图片保存路径
        String filePath = "D:\\cut\\";
        List<File> outputImages = new ArrayList<>();

        try {
            // 读取原始图片
            BufferedImage originalImage = ImageIO.read(srcFile);
            // 图片总高度
            int sliceHeight = originalImage.getHeight();
            // 计算每切片的数量
            int sliceCount = getSliceCount(sliceHeight, desMaxHeight, maxUploadImgNum);
            log.info("分割图片总高度:{}, 分割图片个数:{}", sliceHeight, sliceCount);
            // 循环切割图片并保存
            for (int i = 0; i < sliceCount; i++) {
                int x = 0;
                int y = i * desMaxHeight;
                int width = originalImage.getWidth();
                int height = desMaxHeight;

                if (i + 1 == sliceCount) {
                    height = Math.min(sliceHeight - y, desMaxHeight);
                }
                log.info("分割图片第:{}片,宽度:{}, 高度:{}, ", i, width, height);
                // 绘制切割区域

                //参数依次为，截取起点的x坐标，y坐标，截取宽度，截取高度
                BufferedImage pic2 = originalImage.getSubimage(x, y, width, height);

                // 保存切割后的图片
                File outputImage = new File(filePath, "slice_" + i + "_" + (Strings.isBlank(getFileSuffix(srcFile.getName())) ? "jpg" : getFileSuffix(srcFile.getName())));

                //将截取的子图另行存储
                // File desImage = new File("D:/cut/subjavaPic.png");
                ImageIO.write(pic2, "png", outputImage);
                log.info("[op:cutImages]分割图片第:{}片, 图片大小:{}", i, outputImage.length() / 1024 + "kb");
                outputImages.add(outputImage);
            }

            System.out.println("图片切割完成！");

            return outputImages;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) throws IOException {
        /*String inputPath = "D:\\图片测试";
        // 读取inputPath下的所有图片
        File[] fileArrays = new File(inputPath).listFiles();
        // files 转换为 List
        List<File> fileList = Arrays.asList(fileArrays);
        String outputPath = "D:\\cut\\image.png";
        File mergeImg;
        File newFile;
        try {
            mergeImg = mergeImg(fileList);
            //获取图片信息
            BufferedImage bim = ImageIO.read(mergeImg);
            int srcHeight = bim.getHeight();
            newFile = newResizeImage(mergeImg, mergeImg.getName(), 2000, 1f, 750, srcHeight,true);
            List<File> files = cutImages(newFile, 3000, 10);
            // 保存切割后的图片
            File outputImage = new File(outputPath);
            //获取图片信息
            BufferedImage pic2 = ImageIO.read(newFile);
            //将截取的子图另行存储
            ImageIO.write(pic2, "png", outputImage);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // FileAccessTypeEnum fileAccessTypeEnum = FileAccessTypeEnum.valueOf(0);
        // System.out.println("fileAccessTypeEnum = " + fileAccessTypeEnum);

        String orderWaiterDataListStr = "[{\"c3_id\":null,\"marsked_phone\":\"7877533\",\"c3_name\":null,\"c1_id\":1,\"client_type\":null,\"ds\":\"2024-03-21\",\"c2_name\":null,\"detail_price\":[{\"price\":0.00,\"goodsid\":0,\"skuid\":0,\"count\":0}],\"caid\":\"20086\",\"idfv\":\"testidfv\",\"oaid\":\"10086\",\"channel_name\":\"hz_wyxw_wyxwsq_2000\",\"c2_id\":null,\"c4_id\":null,\"idfa\":\"testidfa\",\"c1_name\":\"合作\",\"order_timestamp\":1711096690074,\"c4_name\":null,\"order_price\":88.99,\"ext_info\":{},\"phone\":\"13979826255\",\"urs\":\"xietao\",\"order_source\":\"1\",\"imei\":\"testimei\",\"order_id\":\"yx_453785914\",\"device\":\"test_case\"},{\"c3_id\":null,\"marsked_phone\":\"7877533\",\"c3_name\":null,\"c1_id\":1,\"client_type\":null,\"ds\":\"2024-03-21\",\"c2_name\":null,\"detail_price\":[{\"price\":0.00,\"goodsid\":0,\"skuid\":0,\"count\":0}],\"caid\":\"20086\",\"idfv\":\"testidfv\",\"oaid\":\"10086\",\"channel_name\":\"hz_wyxw_wyxwsq_2000\",\"c2_id\":null,\"c4_id\":null,\"idfa\":\"testidfa\",\"c1_name\":\"合作\",\"order_timestamp\":1711096690074,\"c4_name\":null,\"order_price\":88.99,\"ext_info\":{},\"phone\":\"13979826255\",\"urs\":\"xietao\",\"order_source\":\"1\",\"imei\":\"testimei\",\"order_id\":\"yx_453785914\",\"device\":\"test_case222222222\"}]";
        List<ChannelOrderWaiterData> orderWaiterDataList = JSON.parseArray(orderWaiterDataListStr, ChannelOrderWaiterData.class);
        System.out.println("orderWaiterDataList = " + orderWaiterDataList);
        orderWaiterDataList.forEach(i -> {
            OrderData orderData = new OrderData();
            OrderDetailData orderDetailData = new OrderDetailData();
            orderDetailData.setOrder_id(Long.valueOf(i.getOrderId().replace("yx_", "")));
            orderDetailData.setOrder_source("test");
            orderDetailData.setOrder_price(i.getOrderPrice());
            orderDetailData.setOrder_timestamp(i.getOrderTimestamp());
            orderDetailData.setDetail_price(JSON.parseArray(i.getDetailPrice(), OrderDetailPriceData.class));

            OrderUserData orderUserData = new OrderUserData();
            orderUserData.setUrs(i.getUrs());
            orderUserData.setPhone(i.getPhone());
            orderUserData.setMarsked_phone(i.getMarskedPhone());
            orderUserData.setOaid(i.getOaid());
            orderUserData.setImei(i.getImei());
            orderUserData.setIdfa(i.getIdfa());
            orderUserData.setIdfv(i.getIdfv());
            orderDetailData.setUser_info(orderUserData);
            orderDetailData.setExt_info(JSON.parseObject(i.getExt_info()));
            orderDetailData.setNewsDevice(i.getDevice());
            orderData.setData(orderDetailData);
            System.out.println("orderData = " + JSON.toJSONString(orderData));
        });
    }

    public static void cutImage(String inputPath, String outputPath, int left, int top, int width, int height) throws IOException {
        // Read the input image
        BufferedImage inputImage = ImageIO.read(new File(inputPath));

        // Create a new cutted image with transparent background
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Draw the cutted image on the output image
        Graphics2D graphics = outputImage.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics.drawImage(inputImage, left, top, width, height, null);
        graphics.dispose();

        // Save the output image
        ImageIO.write(outputImage, "png", new File(outputPath));
    }


}
