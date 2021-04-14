package com.u2d.projeto.controller.request;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PermissaoDTO implements Serializable{
	
	private static final long serialVersionUID = 708100695666834545L;

	@EqualsAndHashCode.Include
	private Long id;
	
	private String descricao;

}
