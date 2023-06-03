const mongoose = require('mongoose');

const BebidaSchema = new mongoose.Schema({
  nome: String,
  descricao: String,
  fabricante: String,
  emEstoque: Boolean,
  publicadoEm: Date,
});

const Bebida = mongoose.model('Bebida', BebidaSchema);

module.exports = Bebida;
