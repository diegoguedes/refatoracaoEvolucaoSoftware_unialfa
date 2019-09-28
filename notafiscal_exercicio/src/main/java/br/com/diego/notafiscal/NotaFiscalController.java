package br.com.diego.notafiscal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotaFiscalController {
	@Autowired
	private NotaFiscalRepository rp;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("listanotasfiscais")
	public String listaNotasFiscais(Model model) {
		Iterable<NotaFiscal> nf = rp.findAll();
		model.addAttribute("notasfiscais", nf);
		return "listanotasfiscais";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("valor") Double valor,
			@RequestParam("imposto") String imposto, Model model) {
		Imposto impostoSelecionado;

		if (imposto.toUpperCase().trim().compareTo("ICMS") == 0) {
			impostoSelecionado = new ICMS();
		} else {
			impostoSelecionado = new ISS();
		}

		NotaFiscal nf = new NotaFiscal(nome, impostoSelecionado.valorImposto().doubleValue(), valor);
		rp.save(nf);
		Iterable<NotaFiscal> nf_list = rp.findAll();
		model.addAttribute("notasfiscais", nf_list);
		return "listanotasfiscais";
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete(@RequestParam("id") Integer id, Model model) {
		NotaFiscal notaFiscal = rp.findOne(id.longValue());

		if (notaFiscal != null) {
			rp.delete(notaFiscal);
		}

		Iterable<NotaFiscal> nf_list = rp.findAll();
		model.addAttribute("notasfiscais", nf_list);

		return "listanotasfiscais";
	}
}