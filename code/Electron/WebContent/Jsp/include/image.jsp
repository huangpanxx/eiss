
<%@page language="java" contentType="image/jpeg; charset=GB18030"
	pageEncoding="GB18030"%>

<%@page
	import="java.awt.*,java.awt.image.*,java.util.*,javax.imageio.*"%>
<%!
    Color getRandColor(int fc, int bc) {
		Random rand = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + rand.nextInt(bc - fc);
		int g = fc + rand.nextInt(bc - fc);
		int b = fc + rand.nextInt(bc - fc);
		return new Color(r, g, b);
	}
%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	// ÔÚÄÚ´æÖÐ´´½¨Í¼Ïñ
	int width = 60, height = 20;
	BufferedImage image = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	Random random = new Random();
	g.setColor(getRandColor(200, 500));
	g.fillRect(0, 0, width, height);
	g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	// ²úÉú50ÌõËæ»ú¸ÉÈÅÏß
	g.setColor(getRandColor(160, 200));
	for (int i = 0; i < 50; i++) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int x1 = random.nextInt(width);
		int y1 = random.nextInt(height);
		g.drawLine(x, y, x + x1, y + y1);
	}

	//»ñÈ¡Ëæ»úÑéÖ¤Âë
	String sRand = "";
	for (int i = 0; i < 4; i++) {
		String rand = String.valueOf(random.nextInt(10));
		sRand += rand;
		//ÏÔÊ¾µ½Í¼Ïñ
		g.setColor(new Color(20 + random.nextInt(110),
		      20 + random.nextInt(110), 20 + random.nextInt(20)));
		g.drawString(rand, 13 * i + 6, 16);
	}
	session.setAttribute("randstring", sRand);
	g.dispose();

	ImageIO.write(image, "JEPG", response.getOutputStream());
%>