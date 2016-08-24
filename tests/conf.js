exports.config = {
  specs: ['todo-spec.js']
};
if (process.env.SNAP_CI) {
  exports.config.chromeDriver = '/usr/local/bin/chromedriver';
}