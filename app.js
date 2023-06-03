const express = require('express');
const mongoose = require('mongoose');
const Bebida = require('./bebidaBebida');
const Lanche = require('./lancheLanche');

mongoose.connect('mongodb://localhost/DevsBar', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

const app = express();
app.use(express.json());

app.post('/cadastrar-bebida', async (req, res) => {
  try {
    const bebida = new Bebida(req.body);
    await bebida.save();
    res.status(201).json(bebida);
  } catch (error) {
    res.status(500).json({ error: 'Erro ao cadastrar bebida' });
  }
});

app.get('/listar-bebidas', async (req, res) => {
  try {
    const bebidas = await Bebida.find();
    res.json(bebidas);
  } catch (error) {
    res.status(500).json({ error: 'Erro ao listar bebidas' });
  }
});

app.post('/cadastrar-lanche', async (req, res) => {
  try {
    const lanche = new Lanche(req.body);
    await lanche.save();
    res.status(201).json(lanche);
  } catch (error) {
    res.status(500).json({ error: 'Erro ao cadastrar lanche' });
  }
});

app.get('/listar-lanche', async (req, res) => {
  try {
    const lanches = await Lanche.find();
    res.json(lanches);
  } catch (error) {
    res.status(500).json({ error: 'Erro ao listar lanches' });
  }
});

const port = 3000;
app.listen(port, () => {
  console.log(`Servidor rodando na porta ${port}`);
});