package com.adminlte.commons.utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CaptchaUtils {
	// 默认的验证码大小
	private static final int WIDTH = 108, HEIGHT = 35;
	// 验证码随机字符数组
	protected static final char[] charArray = "3456789ABCDEFGHJKMNPQRSTUVWXY".toCharArray();
	// 验证码字体
	private static final Font[] RANDOM_FONT = new Font[] {
			new Font("nyala", Font.BOLD, 30), new Font("Arial", Font.BOLD, 32),
			new Font("Bell MT", Font.BOLD, 30),
			new Font("Credit valley", Font.BOLD, 32),
			new Font("Impact", Font.BOLD, 32),
			new Font(Font.MONOSPACED, Font.BOLD, 32) };

	/**
	 * 生成验证码
	 * 
	 * @throws Exception
	 */
	public static BufferedImage generate(HttpServletResponse response, HttpSession session)
			throws Exception {
		BufferedImage image = new BufferedImage(WIDTH, HEIGHT,
				BufferedImage.TYPE_INT_RGB);
		String vCode = drawGraphic(image);
		vCode = vCode.toUpperCase();// 转成大写重要
		session.setAttribute("code", vCode);
		return image;
	}

	public static String drawGraphic(BufferedImage image) {
		// 获取图形上下文
		Graphics2D g = image.createGraphics();

		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
		// 图形抗锯齿
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		// 字体抗锯齿
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// 设定背景色，淡色
		g.setColor(getRandColor(210, 250));
		g.fillRect(0, 0, WIDTH, HEIGHT);

		// 生成随机类
		Random random = new Random();
		// 画小字符背景
		Color color = null;
		for (int i = 0; i < 20; i++) {
			color = getRandColor(120, 200);
			g.setColor(color);
			String rand = String.valueOf(charArray[random
					.nextInt(charArray.length)]);
			g.drawString(rand, random.nextInt(WIDTH), random.nextInt(HEIGHT));
			color = null;
		}
		// 取随机产生的认证码(4位数字)
		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(charArray[random
					.nextInt(charArray.length)]);
			sRand += rand;
			// 旋转度数 最好小于45度
			int degree = random.nextInt(28);
			if (i % 2 == 0) {
				degree = degree * (-1);
			}
			// 定义坐标
			int x = 22 * i, y = 19;
			// 旋转区域
			g.rotate(Math.toRadians(degree), x, y);
			// 设定字体颜色
			color = getRandColor(20, 130);
			g.setColor(color);
			// 设定字体，每次随机
			g.setFont(RANDOM_FONT[random.nextInt(RANDOM_FONT.length)]);
			// 将认证码显示到图象中
			g.drawString(rand, x + 8, y + 10);
			// 旋转之后，必须旋转回来
			g.rotate(-Math.toRadians(degree), x, y);
		}
		// 图片中间曲线，使用上面缓存的color
		g.setColor(color);
		// width是线宽,float型
		BasicStroke bs = new BasicStroke(3);
		g.setStroke(bs);
		// 画出曲线
		QuadCurve2D.Double curve = new QuadCurve2D.Double(0d,
				random.nextInt(HEIGHT - 8) + 4, WIDTH / 2, HEIGHT / 2, WIDTH,
				random.nextInt(HEIGHT - 8) + 4);
		g.draw(curve);
		// 销毁图像
		g.dispose();
		return sRand;
	}

	/**
	 * 给定范围获得随机颜色
	 */
	private static Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}
