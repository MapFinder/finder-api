class CreateLostItems < ActiveRecord::Migration[5.0]
  def change
    create_table :lost_items do |t|
      t.text :description

      t.timestamps
    end
  end
end
