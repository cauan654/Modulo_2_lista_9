const mongoose = require('mongoose');

const LancheSchema = new mongoose.Schema({
  nome: String,
  descricao: String,
  vegano: Boolean,
  emEstoque: Boolean,
  publicadoEm: Date,
});

const Lanche = mongoose.model('Lanche', LancheSchema);

module.exports = Lanche;
