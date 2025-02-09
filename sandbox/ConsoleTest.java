package sandbox;

import java.awt.Color;

import commun.*;

public class ConsoleTest {
	public static void main(String[] args) {
		Console co = new Console("Exemple", 80, 50);
		
		String nom;
		String[] carVal = new String[] {
		"  ! \" # $ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ?",
		"@ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \\ ] ^ _",
		"` a b c d e f g h i j k l m n o p q r s t u v w x y z { | } ~ ⌂",
		"  ¡ ¢ £ ¤ ¥ ¦ § ¨ © ª « ¬ - ® ¯ ° ± ² ³ ´ µ ¶ · ¸ ¹ º » ¼ ½ ¾ ¿",
		"À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö × Ø Ù Ú Û Ü Ý Þ ß",
		"à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ÷ ø ù ú û ü ý þ ÿ",
		"Ā ā Ă ă Ą ą Ć ć Ĉ ĉ Ċ ċ Č č Ď ď Đ đ Ē ē Ĕ ĕ Ė ė Ę ę Ě ě Ĝ ĝ Ğ ğ",
		"Ġ ġ Ģ ģ Ĥ ĥ Ħ ħ Ĩ ĩ Ī ī Ĭ ĭ Į į İ ı Ĳ ĳ Ĵ ĵ Ķ ķ ĸ Ĺ ĺ Ļ ļ Ľ ľ Ŀ",
		"ŀ Ł ł Ń ń Ņ ņ Ň ň ŉ Ŋ ŋ Ō ō Ŏ ŏ Ő ő Œ œ Ŕ ŕ Ŗ ŗ Ř ř Ś ś Ŝ ŝ Ş ş",
		"Š š Ţ ţ Ť ť Ŧ ŧ Ũ ũ Ū ū Ŭ ŭ Ů ů Ű ű Ų ų Ŵ ŵ Ŷ ŷ Ÿ Ź ź Ż ż Ž ž ſ",
		"ƒ ơ Ʒ Ǻ ǻ Ǽ ǽ Ǿ ǿ Ș ș Ț ț ɑ ɸ ˆ ˇ ˉ ˘ ˙ ˚ ˛ ˜ ˝ ; ΄ ΅ Ά · Έ Ή Ί",
		"Ό Ύ Ώ ΐ Α Β Γ Δ Ε Ζ Η Θ Ι Κ Λ Μ Ν Ξ Ο Π Ρ Σ Τ Υ Φ Χ Ψ Ω Ϊ Ϋ ά έ",
		"ή ί ΰ α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ ς σ τ υ φ χ ψ ω ϊ ϋ ό ύ",
		"ώ ϐ ϴ Ѐ Ё Ђ Ѓ Є Ѕ І Ї Ј Љ Њ Ћ Ќ Ѝ Ў Џ А Б В Г Д Е Ж З И Й К Л М",
		"Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я а б в г д е ж з и й к л м",
		"н о п р с т у ф х ц ч ш щ ъ ы ь э ю я ѐ ё ђ ѓ є ѕ і ї ј љ њ ћ ќ",
		"ѝ ў џ Ґ ґ ᴛ ᴦ ᴨ Ẁ ẁ Ẃ ẃ Ẅ ẅ ẟ Ỳ ỳ ‐ ‒ – — ― ‗ ‘ ’ ‚ ‛ “ ” „ ‟ †",
		"‡ • … ‧ ‰ ′ ″ ‵ ‹ › ‼ ‾ ‿ ⁀ ⁄ ⁔ ⁴ ⁵ ⁶ ⁷ ⁸ ⁹ ⁺ ⁻ ⁿ ₁ ₂ ₃ ₄ ₅ ₆ ₇",
		"₈ ₉ ₊ ₋ ₣ ₤ ₧ ₪ € ℅ ℓ № ™ Ω ℮ ⅐ ⅑ ⅓ ⅔ ⅕ ⅖ ⅗ ⅘ ⅙ ⅚ ⅛ ⅜ ⅝ ⅞ ← ↑ →",
		"↓ ↔ ↕ ↨ ∂ ∅ ∆ ∈ ∏ ∑ − ∕ ∙ √ ∞ ∟ ∩ ∫ ≈ ≠ ≡ ≤ ≥ ⊙ ⌀ ⌂ ⌐ ⌠ ⌡ ─ │ ┌",
		"┐ └ ┘ ├ ┤ ┬ ┴ ┼ ═ ║ ╒ ╓ ╔ ╕ ╖ ╗ ╘ ╙ ╚ ╛ ╜ ╝ ╞ ╟ ╠ ╡ ╢ ╣ ╤ ╥ ╦ ╧",
		"╨ ╩ ╪ ╫ ╬ ▀ ▁ ▄ █ ▌ ▐ ░ ▒ ▓ ■ □ ▪ ▫ ▬ ▲ ► ▼ ◄ ◊ ○ ● ◘ ◙ ◦ ☺ ☻ ☼",
		"♀ ♂ ♠ ♣ ♥ ♦ ♪ ♫ ✓ ﬁ ﬂ �                                        "};

		co.println();
		co.println();
		co.println();
		co.print("   Entrez votre nom : ");
		nom = co.nextLine();
		
		co.setTextColor(Color.RED);
		co.setBackgroundColor(Color.YELLOW);
		co.gotoXY(5, 5);
		co.print("Bonjour " + nom + " !");
		co.setTextColor(Color.BLUE);
		co.setBackgroundColor(Color.WHITE);
		co.gotoXY(29, 19);
		co.print("┌────────────────────┐");
		co.gotoXY(29, 20);
		co.print("│ Caractères valides │");
		co.setTextColor(Color.BLACK);
		co.setBackgroundColor(Color.WHITE);
		co.gotoXY(6, 21);
		co.print("┌──────────────────────┴────────────────────┴─────────────────────┐");
		for (int i = 0; i < carVal.length; ++i) {
			co.waitNextFrame();
			co.gotoXY(6, i + 22);
			co.print("│ " + carVal[i] + " │");
		}
		co.gotoXY(6, 45);
		co.print("└─────────────────────────────────────────────────────────────────┘");
	}
}
