package gestionStagiaires.projet.de.stage.export;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;


public class ExportPdf {
    public static ByteArrayInputStream journeeStagiairesReport(List<JourneeStagiaire> journeeStagiaires) {

        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100f);
            table.setWidths(new int[] { 4, 4, 4 , 4 });
            table.setSpacingBefore(10);


            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

            PdfPCell hcell;

            /*hcell = new PdfPCell(new Phrase("Nom", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);*/

            hcell = new PdfPCell(new Phrase("Heure Debut", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Heure Fin", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Date", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);


            for (JourneeStagiaire journeeStagiaire : journeeStagiaires) {

                PdfPCell cell;
                Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
                font.setSize(18);

                /*Paragraph p = new Paragraph("Liste des Stagiaires",font);
                p.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(p);*/


                cell = new PdfPCell(new Phrase(journeeStagiaire.getNom()));
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setPaddingRight(5);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(String.valueOf((journeeStagiaire.getHeureDebut()))));
                cell.setPaddingLeft(5);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(String.valueOf((journeeStagiaire.getHeureFin()))));
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setPaddingRight(5);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(String.valueOf((journeeStagiaire.getDateJournee()))));
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setPaddingRight(5);
                table.addCell(cell);

            }


            PdfWriter.getInstance(document, out);
            document.open();
            document.add(table);

            document.close();

        } catch (DocumentException ex) {

        }

        return new ByteArrayInputStream(out.toByteArray());
    }

}
